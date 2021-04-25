package com.springRest.services;
import java.util.List;

import com.springRest.entities.Employee;

public interface employeeService {
	
	//Get All employees method
	public List<Employee> getEmployees();
	
	//Get individual employee
	public Employee getEmployee(long empId);
	
	//Add new employee
	public Employee addEmployee(Employee emp);
	
	//Delete individual employee
	public String deleteEmployee(long empId);

	//Update individual employee
	public Employee updateEmployee(Employee emp);
	
}