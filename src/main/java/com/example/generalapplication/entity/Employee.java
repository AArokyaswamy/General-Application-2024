package com.example.generalapplication.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
 
/**
 * @author JavaSolutionsGuide
 *
 */
@jakarta.persistence.Entity
@Table(name="Employ")
public class Employee {
  
 @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 private Long employeeId;
  
 @Column(name="First_Name")
 private String firstName;
 
 @Column(name="Last_Name")
 private String lastName;
  
 @Column(name="Salary")
 private Double salary;
  
 @ManyToOne
 @JoinColumn(name="deptId") 
 private Department department;

 
 @Column(name="Start_Date")
 private Date startDate;



public Long getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(Long employeeId) {
	this.employeeId = employeeId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

//public Long getDepartmentId() {
//	return departmentId;
//}
//
//public void setDepartmentId(Long departmentId) {
//	this.departmentId = departmentId;
//}

public Date getStartDate() {
	return startDate;
}

public void setStartDate(Date startDate) {
	this.startDate = startDate;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}
 

}