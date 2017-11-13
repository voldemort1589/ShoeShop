package model;

public class ItemLine {
	private String id;
	private String product;
	private int amount;
	private int total;
	public ItemLine(){
		super();
	}
	public ItemLine(String id, String product, int amount, int total) {
		super();
		this.id = id;
		this.product = product;
		this.amount = amount;
		this.total = total;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
