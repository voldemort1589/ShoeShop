package converter;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import model.Comment;

public class CommentConverter {
	public static DBObject toDBObject(Comment comment) {
		DBObject query = new BasicDBObject();
		query.put("content", comment.getContent());
		query.put("user", UserConverter.toDBObject(comment.getUser()));
		if (comment.getId() != null) {
			query.put("_id", new ObjectId(comment.getId()));
		}
		return query;
	}
	public static Comment toComment(DBObject obj) {
		Comment comment = new Comment();
		comment.setId(String.valueOf(obj.get("_id")));
		comment.setContent((String) obj.get("content"));
		comment.setUser(UserConverter.toUser((DBObject) obj.get("user")));
		return comment;
	}

}
