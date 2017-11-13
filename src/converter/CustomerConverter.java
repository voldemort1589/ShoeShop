package converter;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import model.Customer;

public class CustomerConverter {
	public static DBObject toDBObject(Customer customer){
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("name", customer.getName())
				.append("username", customer.getUsername())
				.append("password", customer.getPassword())
				.append("email", customer.getEmail())
				.append("phone", customer.getPhone())
				.append("address", customer.getAddress());
		if(customer.getId() != null){
			builder = builder.append("_id", new ObjectId(customer.getId())); //_id is primary key in mongoDB
		}
		return builder.get();
	}
	public static Customer toCustomer(DBObject obj){
		Customer customer = new Customer();
		customer.setId(String.valueOf(obj.get("_id")));
		customer.setName(String.valueOf(obj.get("name")));
		customer.setUsername(String.valueOf(obj.get("username")));
		customer.setPassword(String.valueOf(obj.get("password")));
		customer.setEmail(String.valueOf(obj.get("email")));
		customer.setPhone(String.valueOf(obj.get("phone")));
		customer.setAddress(String.valueOf(obj.get("address")));
		return customer;
	}
}
