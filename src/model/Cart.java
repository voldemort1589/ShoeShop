package model;

import java.util.List;

public class Cart {
	private String id;
	private List<ItemLine> orderlist;
	private Customer customer;
	private int totalPrice;
	public Cart(){
		super();
	}
	public Cart(String id, List<ItemLine> orderlist, Customer customer, int totalPrice) {
		super();
		this.id = id;
		this.orderlist = orderlist;
		this.customer = customer;
		this.totalPrice = totalPrice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<ItemLine> getOrderlist() {
		return orderlist;
	}
	public void setOrderlist(List<ItemLine> orderlist) {
		this.orderlist = orderlist;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void checkout(){}
}
