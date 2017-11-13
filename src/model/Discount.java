package model;

public class Discount {
	private String id;
	private String topic;
	private String product;
	private int discount;
	private String startDate;
	private String endDate;
	public Discount(){
		super();
	}
	public Discount(String id, String topic, String product, int discount,
			String startDate, String endDate) {
		super();
		this.id = id;
		this.topic = topic;
		this.product = product;
		this.discount = discount;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
