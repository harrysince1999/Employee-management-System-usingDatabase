package com.restEmp.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restEmp.employee.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Long>{
	
}
