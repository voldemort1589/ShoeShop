package model;

public class Payment {
	private String id;
	private Order order;
	private int amount;
	private String time;
	private Customer customer;
	public Payment(){
		super();
	}
	public Payment(String id, Order order, int amount, String time, Customer customer) {
		super();
		this.id = id;
		this.order = order;
		this.amount = amount;
		this.time = time;
		this.customer = customer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
