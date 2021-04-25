package com.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.entities.Employee;
import com.springRest.services.employeeService;

@RestController
public class mainController {
	@Autowired
	public employeeService empService;
	
	//Root Calling
	@GetMapping("/")
	public String firstMethod() {
		return "Root Called";
	}
	
	//To retrieve all employees in the list
	@GetMapping("/employees")
	public List<Employee> employee(){
		return this.empService.getEmployees();
	}
	
	//To get particular employee
	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable String empId) {
		return this.empService.getEmployee(Long.parseLong(empId));
	}

	//To add new employee
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) {
		return this.empService.addEmployee(emp);
	}
	
	//To delete particular employee
	@DeleteMapping("/employees/{empId}")
	public String deleteEmployee(@PathVariable String empId) {
		return this.empService.deleteEmployee(Long.parseLong(empId));
	}
	
	//To update employee data
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return this.empService.updateEmployee(emp);
	}
}
