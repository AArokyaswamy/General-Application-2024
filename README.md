# General-Application-2024

#Pre-Requisite
	Java 21, 
	Maven
	Mysql

# Build
	1. From terminal : mvn clean install 
	   OR
	2. Inside IDE (IntelliJ) : Add configiguarion for "Maven"
# Run Spring boot application 
  1. from Command Prompt:	Run command 'mvn spring-boot:run' (under project folder)
     Example " ../General-Application-2024> mvn spring-boot:run
     OR
   2.   Inside IDE (IntelliJ) : Add configiguarion for "Application",
        select main class for Springboot Application and select working directory(project folder)
      
   
# Test : Save (Post method)

  **Payload** 
	{
	  "firstName": "Test13",
	  "lastName": "Test13",
	  "salary": 2026,
	  "gender": "F",
	   "department": {
	    "deptId": 1
	  }
	}

	Note :  deptId: 1 should be existing in table


