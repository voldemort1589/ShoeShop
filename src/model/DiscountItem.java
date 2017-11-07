package model;

public class DiscountItem {
	private String id;
	private Product product;
	private int discount;
	public DiscountItem(){
		super();
	}
	public DiscountItem(String id, Product product, int discount) {
		super();
		this.id = id;
		this.product = product;
		this.discount = discount;
	}
	void addItem(){
		
	}
}
