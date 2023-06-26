package com.person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class PersonCRUD {
	
	public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		
		FileInputStream fileInputStream = new FileInputStream("personConfig.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		
		Class.forName(properties.getProperty("className"));
		Connection connection = DriverManager.getConnection(properties.getProperty("url"),"root","toor");
		return connection;
	}
	
	public void insertPerson(Person person) throws ClassNotFoundException, IOException, SQLException {
		
		Connection connection = getConnection();
		PreparedStatement preparedStatement =  connection.prepareStatement(" INSERT INTO person VALUES(?,?,?,?) ");
		preparedStatement.setInt(1, person.getPerson_ID());
		preparedStatement.setString(2, person.getPerson_name());
		preparedStatement.setLong(3, person.getPerson_phone());
		preparedStatement.setString(4, person.getPerson_address());
		
		int count = preparedStatement.executeUpdate();
		if (count!=0) {
			System.out.println("inserted data");
		}else {
			System.out.println("not inserted ");
		}
	}
	
	

}
