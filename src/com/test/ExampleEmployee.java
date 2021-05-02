package com.test;

public class ExampleEmployee {
	private Integer employeeID;
	private String employeeName;
	private Double salery;
	
	public ExampleEmployee(Integer employeeID, String employeeName, Double salery){
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.salery = salery;
	}
	
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getSalery() {
		return salery;
	}
	public void setSalery(Double salery) {
		this.salery = salery;
	}
	public String toString() {
		return this.employeeID+ " " + this.employeeName + " " +this.salery;
	}
}
