package dao;

import java.util.List;

import model.Post;

public interface PostDAO {
	public Post insertPost(Post post);
	public void updatePost(Post post);
	public void deletePost(String id);
	public Post getPost(String id);
	public List<Post> getAllPosts();
}
