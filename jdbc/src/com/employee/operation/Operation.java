package com.employee.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.employee.main.Employee;
import com.jdbc.employee.DataBaseUtil;

public class Operation {
	DataBaseUtil databaseutil = new DataBaseUtil();
 	public void insertEmployee(Employee emp ) throws SQLException {
		
 		Connection connection =  databaseutil.getConnection();
 		PreparedStatement prst = connection.prepareStatement(InsertQuery.insertEmployeeQuery());
 		
 		prst.setInt(1, emp.getManagerID());
 		prst.setString(2, emp.getFName());
 		prst.setString(3, emp.getlName());
 		prst.setLong(4, emp.getPhoneNo());
 		prst.setDouble(5, emp.getSalary());
 		prst.setString(6, emp.getAddress());
 		prst.setString(7, emp.getPosition());
 		prst.setInt(8, emp.getManagerID());
		
 		int row = prst.executeUpdate();
 		if (row!=0) {
			System.out.println("Record is inserted");
		} else {
			System.err.println("Faild to Insert ");
		}
	}//end of the insertEmployee() Method.

}
