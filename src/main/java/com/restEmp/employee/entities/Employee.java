package com.restEmp.employee.entities;

public class Employee {
	private long empId;
	private String empName;
	private String empDesignation;
	public Employee(long empId, String empName, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation + "]";
	}
	
	
}
