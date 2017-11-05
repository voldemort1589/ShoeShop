package dao;

import java.util.List;

import com.mongodb.DBObject;

import model.User;

public interface UserDAO {
	public User insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(String id);
	public User getUser(String id);
	public List<User> getAllUser();
	public DBObject authenticate(String username, String password);
}
