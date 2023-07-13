package com.fullstackweb.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	
	
	final String CLASS_PATH = "com.mysql.cj.jdbc.Driver";
    final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/full_stack_web";
    final String USER_NAME = "root";
	final String PASSWORD = "toor"; 
	
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(CLASS_PATH);
	    Connection connection = DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
		return connection;
	}
	

}
