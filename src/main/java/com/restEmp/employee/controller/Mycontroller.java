package com.restEmp.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restEmp.employee.entities.Employee;
import com.restEmp.employee.service.EmployeeService;

@RestController
public class Mycontroller {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Employees HomePage";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return this.employeeService.getEmployees();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getemployee(@PathVariable String employeeId) {
		return this.employeeService.getEmployee(Long.parseLong(employeeId));
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String employeeId){
		try {
			this.employeeService.deleteEmployee(Long.parseLong(employeeId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
