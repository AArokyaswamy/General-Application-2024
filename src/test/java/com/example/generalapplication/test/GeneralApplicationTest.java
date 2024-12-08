package com.example.generalapplication.test;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.generalapplication.entity.Department;
import com.example.generalapplication.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneralApplicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String SERVER_URI = "http://localhost:8080";
		RestTemplate restTemplate=new RestTemplate();
		//1st way
		ResponseEntity<Employee> emp=restTemplate.getForEntity("http://localhost:8080/getEmployees/1", Employee.class);
		Employee emp1=(Employee)emp.getBody();
		
		System.out.println(emp1.getFirstName());
		
		//2nd Way
		String responseEntityString = restTemplate.getForObject(SERVER_URI+"/getEmployees/1", String.class);
		System.out.println(" responseEntityString URI "+responseEntityString);
		
		//POST : 1st way 
		Employee emp2=new Employee();
		emp2.setEmployeeId(new Long((8)));
		emp2.setFirstName("firstName");
		emp2.setLastName("LastName");
		emp2.setSalary(new Double(1000));
		
		Department dept=new Department();
		dept.setDeptId(new Long(1));
		emp2.setDepartment(dept);
	
		ObjectMapper mapper = new ObjectMapper();
	    //Converting the Object to JSONString
	    String jsonString=null;
		try {
			jsonString = mapper.writeValueAsString(emp2);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    System.out.println("jsonString......"+jsonString);
	    
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);

	    HttpEntity<String> request = new HttpEntity<String>(jsonString, headers);

		restTemplate.postForEntity("http://localhost:8080/getEmployees", request, Employee.class);
		
	    System.out.println("after post......");
		
		
	}

}
