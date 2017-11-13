package converter;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import model.Account;

public class AccountConverter {
	public static DBObject toDBObject(Account account){
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("name", account.getName())
				.append("username", account.getUsername())
				.append("password", account.getPassword())
				.append("email", account.getEmail())
				.append("phone", account.getPhone())
				.append("isEmployee", account.getIsEmployee());
		if(account.getId() != null){
			builder = builder.append("_id", new ObjectId(account.getId())); //_id is primary key in mongoDB
		}
		return builder.get();
	}
	public static Account toAccount(DBObject obj){
		Account account = new Account();
		account.setId(String.valueOf(obj.get("_id")));
		account.setName(String.valueOf(obj.get("name")));
		account.setUsername(String.valueOf(obj.get("username")));
		account.setPassword(String.valueOf(obj.get("password")));
		account.setEmail(String.valueOf(obj.get("email")));
		account.setPhone(String.valueOf(obj.get("phone")));
		account.setIsEmployee(Boolean.parseBoolean(String.valueOf(obj.get("isEmployee"))));
		return account;
	}
}
