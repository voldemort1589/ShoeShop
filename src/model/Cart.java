package model;

import java.util.List;

public class Cart {
	private String id;
	private List<CartItem> orderlist;
	private Customer customer;
	private int totalPrice;
	public Cart(){
		super();
	}
	public Cart(String id, List<CartItem> orderlist, Customer customer, int totalPrice) {
		super();
		this.id = id;
		this.orderlist = orderlist;
		this.customer = customer;
		this.totalPrice = totalPrice;
	}
	void addCartItem(){
		
	}
}
