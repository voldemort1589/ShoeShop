package model;

public class CartItem {
	private String id;
	private Product product;
	private int amount;
	private int total;
	public CartItem(){
		super();
	}
	public CartItem(String id, Product product, int amount, int total) {
		super();
		this.id = id;
		this.product = product;
		this.amount = amount;
		this.total = total;
	}
	void addItem(){
		
	}
}
