package com.management;

public class Employee {
	private String employeeName;
	private String employeeAddress;
	private float employeeSalary;
	
	//constructor
	public Employee(String employeeName, String employeeAddress, Float employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
	}
	
	//getter and setter fields//
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	
	
	
	
	
}
