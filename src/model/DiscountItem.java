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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
