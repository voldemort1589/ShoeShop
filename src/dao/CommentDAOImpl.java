package dao;

import org.bson.types.ObjectId;

import model.Comment;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

import converter.CommentConverter;
import dbUtility.Connector;

public class CommentDAOImpl implements CommentDAO {
	private DBCollection collection;
	public CommentDAOImpl() {
		this.collection = Connector.database.getCollection("Webboard");
	}
	
	@Override
	public void insertComment(Comment comment, String PostID) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(PostID));
		DBObject obj = CommentConverter.toDBObject(comment);
		obj.put("_id", new ObjectId());
		this.collection.update(query, new BasicDBObject("$push", new BasicDBObject("comment", obj)));
	}
	@Override
	public void updateComment(Comment comment, String PostID) {
		DBObject query = new BasicDBObject();
		query.put("$elemMatch", new BasicDBObject("_id", new ObjectId(comment.getId())));
		DBObject obj = new BasicDBObject();
		obj.put("comment", query);
		BasicDBObject update = new BasicDBObject();
		update.put("$set", new BasicDBObject("comment.$.content", comment.getContent()));
		this.collection.update(obj, update);
	}
	@Override
	public void deleteComment(String PostID, String CommentID) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(PostID));
		DBObject obj = new BasicDBObject();
		obj.put("_id", new ObjectId(CommentID));
		this.collection.update(query, new BasicDBObject("$pull", new BasicDBObject("comment", obj)));
	}
	@Override
	public Comment getComment(String PostID, String CommentID) {
		DBObject query = new BasicDBObject();
		query.put("$elemMatch", new BasicDBObject("_id", new ObjectId(CommentID)));
		DBObject obj = new BasicDBObject();
		obj.put("comment", query);
		BasicDBList db = (BasicDBList) this.collection.findOne(new BasicDBObject(), obj).get("comment");
		return CommentConverter.toComment((DBObject) db.iterator().next());
	}
}
	
