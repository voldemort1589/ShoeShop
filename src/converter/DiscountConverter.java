package converter;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import model.Discount;

public class DiscountConverter {
	public static DBObject toDBObject(Discount discount){
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("topic", discount.getTopic())
				.append("product", discount.getProduct())
				.append("discount", discount.getDiscount())
				.append("startDate", discount.getStartDate())
				.append("endDate", discount.getEndDate());
		if(discount.getId() != null){
			builder = builder.append("_id", new ObjectId(discount.getId())); //_id is primary key in mongoDB
		}
		return builder.get();
	}
	public static Discount toDiscount(DBObject obj){
		Discount discount = new Discount();
		discount.setId(String.valueOf(obj.get("_id")));
		discount.setTopic(String.valueOf(obj.get("topic")));
		discount.setProduct(String.valueOf(obj.get("product")));
		discount.setDiscount(Integer.parseInt(String.valueOf(obj.get("address"))));
		discount.setStartDate(String.valueOf(obj.get("address")));
		discount.setEndDate(String.valueOf(obj.get("address")));
		return discount;
	}
}
