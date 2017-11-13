package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import model.Customer;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import converter.CustomerConverter;
import dbUtility.Connector;

public class CusDAOImpl implements CusDAO {

	private DBCollection collection;
	public CusDAOImpl(){
		this.collection = Connector.database.getCollection("Customer");
	}
	
	@Override
	public Customer insertUser(Customer customer) {
		DBObject obj = CustomerConverter.toDBObject(customer);
		this.collection.insert(obj);
		ObjectId id = (ObjectId) obj.get("_id");
		customer.setId((String) id.toString());
		return customer;
	}

	@Override
	public void updateUser(Customer customer) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(customer.getId()));
		this.collection.update(query, CustomerConverter.toDBObject(customer));
	}

	@Override
	public void deleteUser(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		this.collection.remove(query);
	}

	@Override
	public Customer getUser(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		DBObject obj = this.collection.findOne(query);
		return CustomerConverter.toCustomer(obj);
	}

	@Override
	public List<Customer> getAllUser() {
		List<Customer> list = new ArrayList<Customer>();
		DBCursor cursor = this.collection.find();
		while (cursor.hasNext()){
			DBObject obj = cursor.next();
			Customer customer = CustomerConverter.toCustomer(obj);
			list.add(customer);
		}
		return list;
	}

	@Override
	public DBObject authenticate(String username, String password) {
		DBObject query = new BasicDBObject();
		query.put("username", username);
		query.put("password", password);
		return this.collection.findOne(query);
	}

}
