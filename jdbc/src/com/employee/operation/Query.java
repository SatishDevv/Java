package com.employee.operation;

public class Query {
	
	public static String insertEmployeeQuery() {
		return "INSERT INTO employee (EMPID, FName, lName,phoneNo,salary,address,position,managerID) VALUES(?,?,?,?,?,?,?,?)";
	}
	
	public static String fatchEmployeeQuery() {
		return "SELECT * from employee ";
	}
	
	public static String getEmployeeByID(int EMPID) {
		return " SELECT * FROM employee WHERE EMPID =  " + EMPID ; 
		
	}
	public static String DeleteEmployeeByID(int EMPID) {
		return "DELETE FROM employee WHERE EMPID = "+EMPID;
	}
	public static String UpdateEmployeeQuery(int EMPID) {
		return "UPDATE employee SET FName = ?, LName = ?, phoneNo = ?, salary = ?, address = ?, position = ?, managerID = ? WHERE EMPID = "+EMPID;
	}

}
		