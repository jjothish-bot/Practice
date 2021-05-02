package com.test;

public class TestDepartment {
	private String departmentId;
	private String departmentName;
	private String departmentDescription;
	
	public TestDepartment (String departmentId, String departmentName, String departmentDescription){
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	public String toString() {
		return departmentId+" "+departmentName+" "+departmentDescription;
	}
}
