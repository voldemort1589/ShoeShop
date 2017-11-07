package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDAO {
	public Employee insertEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(String id);
	public Employee getEmployee(String id);
	public List<Employee> getAllEmployee();
}
