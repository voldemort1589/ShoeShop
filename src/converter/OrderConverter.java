package converter;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import model.ItemLine;
import model.Order;

public class OrderConverter {
	public static DBObject toDBObject(Order order){
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("customer", order.getCustomer())
				.append("orderlist", order.getOrderlist())
				.append("totalPrice", order.getTotalPrice())
				.append("status", order.getStatus());
		if(order.getId() != null){
			builder = builder.append("_id", new ObjectId(order.getId()));	 // _id is primary key in mongoDB
		}
		return builder.get();
	}
	public static Order toOrder(DBObject obj){
		Order order = new Order();
		order.setId(String.valueOf(obj.get("_id")));
		order.setCustomer(String.valueOf(obj.get("customer")));
		order.setOrderlist(toList(obj)); 	// ********* JSON -> List *********
		order.setTotalPrice(Integer.parseInt(String.valueOf(obj.get("totalPrice"))));
		order.setStatus(Integer.parseInt(String.valueOf(obj.get("status"))));
		return order;
	}
	public static List<ItemLine> toList(DBObject obj){
		List<ItemLine> itemLine = new ArrayList<ItemLine>();
		BasicDBList itemList = (BasicDBList) obj.get("orderlist");
		for (int i=0; i<itemList.size(); i++){
			ItemLine item = new ItemLine();
			BasicDBObject itemObj = (BasicDBObject) itemList.get(i);
			item.setId(itemObj.getString("id"));
			item.setProduct(itemObj.getString("product"));
			item.setAmount(itemObj.getInt("amount"));
			item.setTotal(itemObj.getInt("total"));
			itemLine.add(item);
		}
		return itemLine;
	}
}
