package model;

import java.util.ArrayList;
import java.util.List;

public class Post {
	String id;
	String title;
	String content;
	User user;
	List<Comment> comment;
	
	public Post() {
		this.comment = new ArrayList<Comment>();
	}
	public Post(String id, String title, String content, User user, List<Comment> comment){
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.user = user;
		this.comment = comment;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
}
