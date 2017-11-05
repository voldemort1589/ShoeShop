package dao;

import model.Comment;

public interface CommentDAO {
	public void insertComment(Comment comment, String PostID);
	public void updateComment(Comment comment, String PostID);
	public void deleteComment(String PostID, String CommentID);
	public Comment getComment(String PostID, String CommentID);
}

