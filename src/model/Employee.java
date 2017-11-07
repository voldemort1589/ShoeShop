package model;

public class Employee {
	private String id;
	private String name;
	private String username;
	private String password;
	private int salary;
	private String email;
	private String phone;
	public Employee(){
		super();
	}
	public Employee(String id, String name, String username, String password, int salary, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.salary = salary;
		this.email = email;
		this.phone = phone;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
