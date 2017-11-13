package converter;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import model.Payment;

public class PaymentConverter {
	public static DBObject toDBObject(Payment payment){
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("order", payment.getOrder())
				.append("amount", payment.getAmount())
				.append("time", payment.getTime())
				.append("bank", payment.getBank())
				.append("customer", payment.getAmount());
		if(payment.getId() != null){
			builder = builder.append("_id", new ObjectId(payment.getId())); //_id is primary key in mongoDB
		}
		return builder.get();
	}
	public static Payment toPayment(DBObject obj){
		Payment payment = new Payment();
		payment.setId(String.valueOf(obj.get("_id")));
		payment.setOrder(String.valueOf(obj.get("order")));
		payment.setAmount(Integer.parseInt(String.valueOf(obj.get("amount"))));
		payment.setTime(String.valueOf(obj.get("time")));
		payment.setBank(String.valueOf(obj.get("bank")));
		payment.setCustomer(String.valueOf(obj.get("customer")));
		return payment;
	}
}
