package com.employee.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.main.Employee;
import com.jdbc.employee.DataBaseUtil;

public class Operation {
	DataBaseUtil databaseutil = new DataBaseUtil();

	public void insertEmployee(Employee employee) throws SQLException {

		Connection connection = databaseutil.getConnection();
		PreparedStatement prst = connection.prepareStatement(Query.insertEmployeeQuery());

		prst.setInt(1, employee.getEMPID());
		prst.setString(2, employee.getFName());
		prst.setString(3, employee.getlName());
		prst.setLong(4, employee.getPhoneNo());
		prst.setDouble(5, employee.getSalary());
		prst.setString(6, employee.getAddress());
		prst.setString(7, employee.getPosition());
		prst.setInt(8, employee.getManagerID());

		int row = prst.executeUpdate();
		if (row != 0) {
			System.out.println("Record is inserted");
		} else {
			System.err.println("Failed to Insert ");
		}
	}// end of the insertEmployee() Method.

	public void fetchData() throws SQLException {

		Connection connection = databaseutil.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(Query.fatchEmployeeQuery());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" | EMPID   | \t FName | \t LName | \t  phoneNo | \t salary | \t address | \t position | \t managerID | ");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		while (resultSet.next()) {
			printEmployee(new Employee(resultSet.getInt("EMPID"), resultSet.getString("FName"),
					resultSet.getString("LName"), resultSet.getLong("phoneNo"), resultSet.getDouble("salary"),
					resultSet.getString("address"), resultSet.getString("position"), resultSet.getInt("managerID")));
			

		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
	}// end of the fetchData() Method.

	private void printEmployee(Employee employee) {
		System.out.println(" |   " + employee.getEMPID() + "   | " + " \t " + employee.getFName() + "\t \t "
				+ employee.getlName() + " \t \t " + employee.getPhoneNo() + "\t  " + employee.getSalary()+" \t "+employee.getAddress() +" \t \t "+employee.getPosition() + " \t \t "+employee.getManagerID() +" \t | " );
	}//end of  the private printEmployee() method
	
		
	public boolean getEmployeeById(int EMPID) throws SQLException {
		
		boolean isFound = false;
		
		Connection connection = databaseutil.getConnection();
		Statement statement = connection.createStatement();
		
	 	ResultSet resultSet = statement.executeQuery(Query.getEmployeeByID(EMPID));
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" | EMPID   | \t FName | \t LName | \t  \t  phoneNo | \t salary | \t address | \t position | \t managerID | ");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		if(resultSet.next()) {
			isFound = true ;
			printEmployee(new Employee(resultSet.getInt("EMPID"), resultSet.getString("FName"),
					resultSet.getString("LName"), resultSet.getLong("phoneNo"), resultSet.getDouble("salary"),
					resultSet.getString("address"), resultSet.getString("position"), resultSet.getInt("managerID")));
			

		}else {
			System.err.println("Record is Not Found  for the id "+ EMPID );
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
	 	 
	 	 
		return isFound;
		
	}// end of the getEmployeeById() method.
	
	
	public void deleteEmployeeByID(int EMPID) throws SQLException {
		
	 	 Connection connection = databaseutil.getConnection();
	 	 Statement statement =  connection.createStatement();
	 	 int row = statement.executeUpdate(Query.DeleteEmployeeByID(EMPID));
	 	 if(row!=0) {
	 		 System.out.println("Recored Is Deleted");
	 	 }else {
	 		 System.err.println("Recored Is Not Found");
	 	 }
		
		
		
	}// end of the deleteEmployeeByID().
	
	public void updateEmployee(Employee employee) throws SQLException {
		
		Connection connection =  databaseutil.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(Query.UpdateEmployeeQuery(employee.getEMPID()));
		
		preparedStatement.setString(1, employee.getFName());
		preparedStatement.setString(2, employee.getAddress());
		preparedStatement.setLong(3,   employee.getPhoneNo());
		preparedStatement.setDouble(4, employee.getSalary());
		preparedStatement.setString(5, employee.getAddress());
		preparedStatement.setString(6, employee.getPosition());
		preparedStatement.setInt(7,    employee.getManagerID());
//		preparedStatement.setInt(8, employee.getEMPID());
		
		int row = preparedStatement.executeUpdate();
		if (row!=0) {
			System.out.println("Record Updated Successfully");
		} else {
			System.err.println("Failed to Updated Recored ");

		}
	}// end of updateEmployee() Method
	
 	
	
	

}
