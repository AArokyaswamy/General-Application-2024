package com.example.generalapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.example.generalapplication.entity.Employee;
import com.example.generalapplication.exception.ResourceNotFoundException;
import com.example.generalapplication.service.EmployeeService;




@RestController
public class GeneralApplicationController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/getEmployees/{emplyeeId}")
	public Employee getEmployeeById(@PathVariable(name="emplyeeId") Long emplyeeId) {
		
	
		Employee emp=null;
		try {
		 emp = employeeService.getEmployeeById(emplyeeId);

	     }
	    catch (Exception exc) {
	    	
	         throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee Not Found", exc);

	    }
	    return	emp;
	    	
	
	}

	
	@PostMapping("/saveEmployee")
	public void saveEmployee(@RequestBody Employee employee) {
		 employeeService.saveEmployee(employee);
	
	}
	

}