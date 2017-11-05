package model;

public class Comment {
	String id;
	String content;
	User user;
	public Comment() {
	}
	public Comment(String id, String content, User user) {
		super();
		this.id = id;
		this.content = content;
		this.user = user;
	}
	// Getter, Setter methods
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
}
