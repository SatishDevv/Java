package com.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.student.model.Student;

public class StoreDataInJDBC {
	// load and register the driver as will as establish the connection. 
	public Connection getConection() throws ClassNotFoundException, SQLException {
		final String CLASS_PATH = "com.mysql.cj.jdbc.Driver";
	    final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/studentdb";
	    final String USER_NAME = "root";
		final String PASSWORD = "toor"; 
		
		Class.forName(CLASS_PATH);
		Connection connection = DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
		return connection;
	}//end of Connection method.
	
	// insert a student Recorders  in database. 
	public int insertStudent(Student student ) throws ClassNotFoundException, SQLException {
		
		Connection connection = getConection();
		PreparedStatement preparedStatement = connection.prepareStatement(Query.insertStudent());
		preparedStatement.setInt(1, student.getStudent_id());
		preparedStatement.setString(2, student.getStudent_name());
		preparedStatement.setString(3, student.getStudent_middle_name());
		preparedStatement.setString(4, student.getStudent_last_name());
		preparedStatement.setString(5, student.getStudent_bday());
//		preparedStatement.setInt(6, student.getStudent_passout_year());
		preparedStatement.setLong(7, student.getStudent_phone());
		preparedStatement.setInt(8, student.getStuden_lastyear_marks());
		
		int result =  preparedStatement.executeUpdate();
		connection.close();
		return result;
	}//end of the insertStudent() method.


} // end of class  
