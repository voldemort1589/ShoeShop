package model;
import java.util.List;
public class Order {
	private String id;
	private List<OrderList> orderlist;
	private Customer customer;
	private int totalPrice;
	private int status;
	public Order(){
		super();
	}
	public Order(String id, List<OrderList> orderlist, Customer customer, int totalPrice, int status) {
		super();
		this.id = id;
		this.orderlist = orderlist;
		this.customer = customer;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	void makeOrder(){
		
	}
	void addOrderList(){
		
	}
	
}
