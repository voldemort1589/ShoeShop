package converter;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import model.User;

public class UserConverter {
	public static DBObject toDBObject(User user){
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("name", user.getName())
				.append("username", user.getUsername())
				.append("password", user.getPassword());
		if(user.getId() != null){
			builder = builder.append("_id", new ObjectId(user.getId())); //_id is primary key in mongoDB
		}
		return builder.get();
	}
	public static User toUser(DBObject obj){
		User user = new User();
		user.setId(String.valueOf(obj.get("_id")));
		user.setName(String.valueOf(obj.get("name")));
		user.setUsername(String.valueOf(obj.get("username")));
		user.setPassword(String.valueOf(obj.get("password")));
		return user;
	}
}
