package converter;

import java.util.List;

import org.bson.types.ObjectId;

import model.Comment;
import model.Post;
import model.User;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class PostConverter {
	public static DBObject toDBObject(Post post) {
		DBObject query = new BasicDBObject();
		query.put("title", post.getTitle());
		query.put("content", post.getContent());
		query.put("user", UserConverter.toDBObject(post.getUser()));
		query.put("comment", post.getComment());
		if (post.getId() != null) {
			query.put("_id", new ObjectId(post.getId()));
		}
		return query;
	}
	public static Post toPost(DBObject obj) {
		Post post = new Post();
		post.setId(String.valueOf(obj.get("_id")));
		post.setTitle((String) obj.get("title"));
		post.setContent((String) obj.get("content"));
		post.setUser(UserConverter.toUser((DBObject) obj.get("user")));
		post.setComment((List<Comment>) obj.get("comment"));
		return post;
	}

}
