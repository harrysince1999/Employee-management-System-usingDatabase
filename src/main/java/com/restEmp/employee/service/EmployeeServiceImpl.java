package com.restEmp.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.restEmp.employee.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> list;
	public EmployeeServiceImpl() {
		list = new ArrayList<>();
		list.add(new Employee(1,"Harikesh","SDE Intern"));
		list.add(new Employee(2,"Amit","SDE Intern"));
		list.add(new Employee(3,"Devansh","Sde Intern"));
	}
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Employee getEmployee(long employeeId) {
		Employee e=null;
		for(Employee employee : list) {
			if(employee.getEmpId()==employeeId)
			{
				e=employee;
				break;
			}
		}
		return e;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		list.add(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		list.forEach(e->{
			if(e.getEmpId()==employee.getEmpId()) {
				e.setEmpName(employee.getEmpName());
				e.setEmpDesignation(employee.getEmpDesignation());
			}
		});
		return employee;
	}

	@Override
	public void deleteEmployee(long parseLong) {
		list= this.list.stream().filter(e->e.getEmpId()!=parseLong).collect(Collectors.toList());
	}

}
