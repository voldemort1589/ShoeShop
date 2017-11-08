package model;
import java.util.List;
public class Order {
	private String id;
	private Customer customer;
	private List<ItemLine> orderlist;
	private int totalPrice;
	private int status;
	public Order(){
		super();
	}
	public Order(String id, Customer customer, List<ItemLine> orderlist,
			int totalPrice, int status) {
		super();
		this.id = id;
		this.customer = customer;
		this.orderlist = orderlist;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<ItemLine> getOrderlist() {
		return orderlist;
	}
	public void setOrderlist(List<ItemLine> orderlist) {
		this.orderlist = orderlist;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void changeStatus(){}
	public void printInvoice(){}
}
