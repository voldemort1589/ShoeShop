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
	public List<DiscountItem> getItems() {
		return items;
	}
	public void setItems(List<DiscountItem> items) {
		this.items = items;
	}
}
