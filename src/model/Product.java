package model;

public class Product {
	private String id;
	private String name;
	private String color;
	private int size;
	private int amount;
	private int discount;
	private int price;
	private Employee adder;
	public Product(){
		super();
	}
	public Product(String id, String name, String color, int size, int amount, int discount, int price, Employee adder) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.size = size;
		this.amount = amount;
		this.discount = discount;
		this.price = price;
		this.adder = adder;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Employee getAdder() {
		return adder;
	}
	public void setAdder(Employee adder) {
		this.adder = adder;
	}
}