package model;

public class Account {
	private String id;
	private String name;
	private String username;
	private String password;
	private String email;
	private String phone;
	private boolean isEmployee;
	public Account(){
		super();
	}
	public Account(String id, String name, String username, String password,
			String email, String phone, boolean isEmployee) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.isEmployee = isEmployee;
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
	public boolean getIsEmployee() {
		return isEmployee;
	}
	public void setIsEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}
	
}