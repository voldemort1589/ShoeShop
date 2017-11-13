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
		List<ItemLine> order = new ArrayList<ItemLine>();
		BasicDBList orderlist = (BasicDBList) obj.get("orderlist");
		for (int i=0; i<orderlist.size(); i++){
			ItemLine item = new ItemLine();
			BasicDBObject orderObj = (BasicDBObject) orderlist.get(i);
			item.setId(orderObj.getString("id"));
			item.setProduct(orderObj.getString("product"));
			item.setAmount(orderObj.getInt("amount"));
			item.setTotal(orderObj.getInt("total"));
			order.add(item);
		}
		return order;
	}
}
