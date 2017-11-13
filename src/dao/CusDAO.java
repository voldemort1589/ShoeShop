package dao;

import java.util.List;

import model.Customer;

import com.mongodb.DBObject;

public interface CusDAO {
	public Customer insertUser(Customer customer);
	public void updateUser(Customer customer);
	public void deleteUser(String id);
	public Customer getUser(String id);
	public List<Customer> getAllUser();
	public DBObject authenticate(String username, String password);
}
