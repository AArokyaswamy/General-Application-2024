git clone https://github.com/AArokyaswamy/General-Application-2024.git
git checkout develop


CREATE TABLE IF NOT EXISTS my_db.Depart(
    deptId INT AUTO_INCREMENT PRIMARY KEY,
    deptName VARCHAR(50) NOT NULL

);


CREATE TABLE IF NOT EXISTS my_db.Employee (
    employeeId INT AUTO_INCREMENT PRIMARY KEY,
    First_Name VARCHAR(50) NOT NULL,
    Last_Name VARCHAR(50) NOT NULL,
    Salary DOUBLE NOT NULL,
    gender VARCHAR(100) NOT NULL,
    deptId INT REFERENCES my_db.Depart(deptid) ,

    CONSTRAINT fk_employee_department
    FOREIGN KEY (deptid)
    REFERENCES depart(deptid)
    ON DELETE SET NULL   
    ON UPDATE CASCADE

);

select * from my_db.Employee;
select * from my_db.Depart;

//truncate table my_db.Employee;
//drop table my_db.Depart;

Testing
---
http:/localhost:8080/saveEmployee
POST

{
  "firstName": "Test11",
  "lastName": "Test11",
  "salary": 2026,
  "gender": "F",
   "department": {
    "deptId": 1
  }
}
