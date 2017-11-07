package model;

import java.util.List;

public class Discount {
	private String id;
	private String topic;
	private String startDate;
	private String endDate;
	private List<DiscountItem> items;
	public Discount(){
		super();
	}
	public Discount(String id, String topic, String startDate, String endDate, List<DiscountItem> items) {
		super();
		this.id = id;
		this.topic = topic;
		this.startDate = startDate;
		this.endDate = endDate;
		this.items = items;
	}
	void addDiscount(){
		
	}
	void addItems(){
		
	}
}
