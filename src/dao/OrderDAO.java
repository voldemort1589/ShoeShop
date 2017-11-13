package dao;

import java.util.List;

import model.Order;

public interface OrderDAO {
	public Order insertOrder(Order order);
	public void updateOrder(Order order);
	public void deleteOrder(String id);
	public Order getOrder(String id);
	public List<Order> getAllOrder();
}
