package com.employee.operation;

public class InsertQuery {
	
	public static String insertEmployeeQuery() {
		return "INSERT INTO employee (EMPID, FName, lName,phoneNo,salary,address,position,managerID) VALUES(?,?,?,?,?,?,?,?)";
	}

}
