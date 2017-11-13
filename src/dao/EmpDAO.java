package dao;

import java.util.List;

import model.Employee;

import com.mongodb.DBObject;

public interface EmpDAO {
	public Employee insertUser(Employee employee);
	public void updateUser(Employee employee);
	public void deleteUser(String id);
	public Employee getUser(String id);
	public List<Employee> getAllUser();
	public DBObject authenticate(String username, String password);
}
