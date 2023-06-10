package com.restEmp.employee.service;

import java.util.List;

import com.restEmp.employee.entities.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees();
	public Employee getEmployee(long employeeId);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(long parseLong);
}
