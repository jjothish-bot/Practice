package com.test;

public class TestEmployee {
	
	private String employeeId;
	private String employeeName;
	private TestDepartment departmentId;
	
	public TestEmployee(String employeeId, String employeeName, TestDepartment departmentId) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.departmentId = departmentId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public TestDepartment getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(TestDepartment departmentId) {
		this.departmentId = departmentId;
	}
	
	public String toString() {
		return employeeId+" "+employeeName+" "+departmentId.getDepartmentName();
	}

}
