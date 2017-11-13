package model;

public class Employee extends Account{
	private String id;
	private int salary;
	public Employee(){
		super();
	}
	public Employee(String id, int salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
