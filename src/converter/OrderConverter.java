package converter;

import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import model.Order;

public class OrderConverter {
	public static DBObject toDBObject(Order order){
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("customer", order.getCustomer())
				.append("orderlist", order.getOrderlist())
				.append("totalPrice", order.getTotalPrice())
				.append("status", order.getStatus());
		if(order.getId() != null){
			builder = builder.append("_id", new ObjectId(order.getId())); //_id is primary key in mongoDB
		}
		return builder.get();
	}
	public static Order toOrder(DBObject obj){
		Order order = new Order();
		order.setId(String.valueOf(obj.get("_id")));
		order.setCustomer(String.valueOf(obj.get("customer")));
		order.setOrderlist(String.valueOf(obj.get("orderlist"))); // ********* JSON -> List *********
		order.setTotalPrice(String.valueOf(obj.get("totalPrice")));
		order.setStatus(String.valueOf(obj.get("status")));
		return order;
	}
}
