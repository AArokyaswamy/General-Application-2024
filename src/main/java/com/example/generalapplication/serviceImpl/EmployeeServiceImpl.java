package com.example.generalapplication.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.generalapplication.entity.Employee;
import com.example.generalapplication.exception.ResourceNotFoundException;
import com.example.generalapplication.repository.EmployeeRepository;
import com.example.generalapplication.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployeeById(Long emplyeeId) {
		Optional<Employee>  opt=employeeRepository.findById(emplyeeId);
		return opt.get();
		//return opt.orElse(new ResourceNotFoundException("Data not found"));
	}

	@Override
	//@Transactional
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}
	

}
