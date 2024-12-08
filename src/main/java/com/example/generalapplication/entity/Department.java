package com.example.generalapplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Depart")
public class Department {
  
 @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 private Long deptId;
  
 @Column(name="Dept_Name")
 private String deptName;

public Long getDeptId() {
	return deptId;
}

public void setDeptId(Long deptId) {
	this.deptId = deptId;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}
 

}