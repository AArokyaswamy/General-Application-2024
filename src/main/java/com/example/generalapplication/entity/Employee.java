package com.example.generalapplication.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

/**
 * @author JavaSolutionsGuide
 *
 */
@jakarta.persistence.Entity
@Table(name="Employee")
public class Employee {
  
 @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 @Column(name="employeeid")
 private Long employeeId;
  
 @Column(name="First_Name")
 private String firstName;
 
 @Column(name="Last_Name")
 private String lastName;
  
 @Column(name="Salary")
 private Double salary;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name="gender")
    private String gender;

// @ManyToOne(cascade = CascadeType.ALL)
// @JoinColumn(name="Dept_Id")
// private Department department;


    //@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}) -- working
    // Do NOT include CascadeType.PERSIST or CascadeType.ALL here
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "deptid", nullable = false)
    private Department department;

 
// @Column(name="Start_Date")
// private Date startDate;



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

//public Date getStartDate() {
//	return startDate;
//}
//
//public void setStartDate(Date startDate) {
//	this.startDate = startDate;
//}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}
 

}