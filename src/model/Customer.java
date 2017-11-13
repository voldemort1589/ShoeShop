package model;

public class Customer extends Account{
	private String id;
	private String address;
	public Customer(){
		super();
	}
	public Customer(String id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}