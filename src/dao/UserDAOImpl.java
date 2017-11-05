package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import model.User;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import converter.UserConverter;
import dbUtility.Connector;

public class UserDAOImpl implements UserDAO {
	private DBCollection collection;
	public UserDAOImpl(){
		this.collection = Connector.database.getCollection("User");
	}
	
	@Override
	public User insertUser(User user) {
		DBObject obj = UserConverter.toDBObject(user);
		this.collection.insert(obj);
		ObjectId id = (ObjectId) obj.get("_id");
		user.setId((String) id.toString());
		return user;
	}

	@Override
	public void updateUser(User user) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(user.getId()));
		this.collection.update(query, UserConverter.toDBObject(user));
		
	}

	@Override
	public void deleteUser(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		this.collection.remove(query);
	}

	@Override
	public User getUser(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		DBObject obj = this.collection.findOne(query);
		return UserConverter.toUser(obj);
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = new ArrayList<User>();
		DBCursor cursor = this.collection.find();
		while (cursor.hasNext()){
			DBObject obj = cursor.next();
			User user = UserConverter.toUser(obj);
			list.add(user);
		}
		return list;
	}

	@Override
	public DBObject authenticate(String username, String password) {
		DBObject query = new BasicDBObject();
		query.put("_id", username);
		query.put("_id", password);
		return this.collection.findOne(query);
	}

}
