package model;

public class OrderList {
	private String id;
	private Product product;
	private int amount;
	private int total;
	public OrderList(){
		super();
	}
	public OrderList(String id, Product product, int amount, int total) {
		super();
		this.id = id;
		this.product = product;
		this.amount = amount;
		this.total = total;
	}
	void addItem(){
		
	}
}
