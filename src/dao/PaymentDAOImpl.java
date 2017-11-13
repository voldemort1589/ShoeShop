package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import converter.PaymentConverter;
import dbUtility.Connector;
import model.Payment;

public class PaymentDAOImpl implements PaymentDAO {
	
	private DBCollection collection;
	public PaymentDAOImpl(){
		this.collection = Connector.database.getCollection("Payment");
	}
	
	@Override
	public Payment insertPayment(Payment payment) {
		DBObject obj = PaymentConverter.toDBObject(payment);
		this.collection.insert(obj);
		ObjectId id = (ObjectId) obj.get("_id");
		payment.setId((String) id.toString());
		return payment;
	}

	@Override
	public void updatePayment(Payment payment) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(payment.getId()));
		this.collection.update(query, PaymentConverter.toDBObject(payment));
	}

	@Override
	public void deletePayment(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		this.collection.remove(query);
	}

	@Override
	public Payment getPayment(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		DBObject obj = this.collection.findOne(query);
		return PaymentConverter.toPayment(obj);
	}

	@Override
	public List<Payment> getAllPayment() {
		List<Payment> list = new ArrayList<Payment>();
		DBCursor cursor = this.collection.find();
		while (cursor.hasNext()){
			DBObject obj = cursor.next();
			Payment payment = PaymentConverter.toPayment(obj);
			list.add(payment);
		}
		return list;
	}
	
}