package model;

public class Payment {
	private String id;
	private String order;
	private int amount;
	private String time;
	private String customer;
	private String bank;
	public Payment(){
		super();
	}
	public Payment(String id, String order, int amount, String time,
			String customer, String bank) {
		super();
		this.id = id;
		this.order = order;
		this.amount = amount;
		this.time = time;
		this.customer = customer;
		this.bank = bank;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
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
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
}
