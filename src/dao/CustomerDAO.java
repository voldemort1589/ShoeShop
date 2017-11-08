package dao;

import java.util.List;

import model.Customer;;

public interface CustomerDAO {
	public Customer insertCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(String id);
	public Customer getCustomer(String id);
	public List<Customer> getAllCustomer();
}
