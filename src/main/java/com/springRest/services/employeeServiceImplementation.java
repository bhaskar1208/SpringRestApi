package com.springRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.entities.Employee;
import com.springRest.repo.EmployeeRepo;
@Service
public class employeeServiceImplementation implements employeeService {

	//List<Employee> list;
	@Autowired
	private EmployeeRepo empRepo;
	
	public employeeServiceImplementation() {
		/*
		 * list=new ArrayList<>(); list.add(new Employee(1,"Bhaskar Deka","Jalukbari"));
		 * list.add(new Employee(2,"Jugjyoti Borgohain","Jalukbari")); list.add(new
		 * Employee(3,"Niranjan Kalita","Chandmari"));
		 */
	}
	@Override
	public List<Employee> getEmployees() {
	//	return list;
		return empRepo.findAll();
	}
	
	@Override
	public Employee getEmployee(long empId) {
	//	Employee employee=null;
	//	for(Employee emp :list)
	//	{
	//		if(emp.getEmpId()==empId)
	//		{
	//			employee=emp;
	//			break;
	//		}
	//	}
	//	return employee;
		return empRepo.getOne(empId);
	}
	@Override
	public Employee addEmployee(Employee emp) {
		//	list.add(emp);
		empRepo.save(emp);
		return emp;
	}
	
	@Override
	public String deleteEmployee(long empId) {
	//	int indexOfEmp=0;
	//	for(Employee emp : list) {
	//		if(emp.getEmpId()==empId) {
	//			indexOfEmp=list.indexOf(emp);
	//			break;
	//		}
	//	}
	//	list.remove(indexOfEmp);
		Employee e=empRepo.getOne(empId);
		empRepo.delete(e);
		return "Deleted employee of Id "+empId;
	}
	
	@Override
	public Employee updateEmployee(Employee emp) {
	//	int indx=0;
	//	for(Employee empl : list) {
	//		if(empl.getEmpId()==emp.getEmpId()) {
	//			indx=list.indexOf(empl);
	//			break;
	//		}
	//	}
	//	list.set(indx, emp);
		
		empRepo.save(emp);
		return emp;
	}

}
