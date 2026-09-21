package com.example.generalapplication.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Depart")
public class Department {
   @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 @Column(name="deptid")
 private Long deptId;
  
 @Column(name="deptname")
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

//
//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }

//    // cascade = CascadeType.ALL ensures saving a department also saves its employees
//    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Employee> employees = new ArrayList<>();


}