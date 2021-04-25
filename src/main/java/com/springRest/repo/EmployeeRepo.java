package com.springRest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springRest.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	
}
