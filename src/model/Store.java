package model;

import java.util.List;

public class Store {
	private String id;
	private String name;
	private String location;
	private String detail;
	private List<Product> product;
	public Store(){
		super();
	}
	public Store(String id, String name, String location, String detail,
			List<Product> product) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.detail = detail;
		this.product = product;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public void searchProduct(){}
}
