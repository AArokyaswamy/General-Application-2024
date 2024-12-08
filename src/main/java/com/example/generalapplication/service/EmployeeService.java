package com.example.generalapplication.service;
import com.example.generalapplication.entity.Employee;

public interface EmployeeService {
	
	public Employee getEmployeeById(Long emplyeeId)  ;
	public void saveEmployee(Employee employee) ;

}
