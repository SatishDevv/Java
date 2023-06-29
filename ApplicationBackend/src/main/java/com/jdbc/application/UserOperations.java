package com.jdbc.application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class UserOperations {
	
	public Connection getConnection() throws IOException, SQLException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("Application.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		Class.forName(properties.getProperty("CLASS_NAME"));
		Connection connection	= DriverManager.getConnection(properties.getProperty("DATABASE_PATH"),properties.getProperty("USER_NAME"),properties.getProperty("PASSWORD"));
		return connection;
	}
	

	public void signUP(User user) throws ClassNotFoundException, IOException, SQLException {
		
		 Connection connection = getConnection() ;
		 
		 connection.prepareStatement(SqlQuery.insertValues());
		 
		 
		 
		
		
		
	}
	
	

}
