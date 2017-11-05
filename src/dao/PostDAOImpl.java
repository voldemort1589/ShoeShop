package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import model.Post;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import converter.PostConverter;
import dbUtility.Connector;

public class PostDAOImpl implements PostDAO {
	private DBCollection collection;
	public PostDAOImpl() {
		this.collection = Connector.database.getCollection("Webboard");
	}
	@Override
	public Post insertPost(Post post) {
		DBObject obj = PostConverter.toDBObject(post);
		this.collection.insert(obj);
		ObjectId id = (ObjectId) obj.get("_id");
		post.setId((String) id.toString());
		return post;
	}
	@Override
	public void updatePost(Post post) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(post.getId()));
		DBObject obj = new BasicDBObject();
		obj.put("title", post.getTitle());
		obj.put("content", post.getContent());
		this.collection.update(query, new BasicDBObject("$set",obj));
	}
	@Override
	public void deletePost(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		this.collection.remove(query);
	}
	@Override
	public Post getPost(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		DBObject obj = this.collection.findOne(query);
		return PostConverter.toPost(obj);
	}
	@Override
	public List<Post> getAllPosts() {
		List<Post> list = new ArrayList<Post>();
		DBCursor cursor = this.collection.find();
		while (cursor.hasNext()) {
		DBObject obj = cursor.next();
		Post post = PostConverter.toPost(obj);
		list.add(post);
		}
		return list;
	}

}
