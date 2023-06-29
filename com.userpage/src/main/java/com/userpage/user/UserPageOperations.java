package com.userpage.user;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class UserPageOperations {
	
	public  Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		FileReader fileReader = new FileReader("userperson.properties");
		Properties properties = new Properties();
		properties.load(fileReader);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));

	}

	public void signUpUser(UserPage userPage) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO userpage (id,name,phone,email,password) VALUES(?,?,?,?,?)");
		
		preparedStatement.setInt(1, userPage.getId());
		preparedStatement.setString(2, userPage.getName());
		preparedStatement.setLong(3, userPage.getPhone());
		preparedStatement.setString(4, userPage.getEmail());
		preparedStatement.setString(5, userPage.getPassword());
		int update = preparedStatement.executeUpdate();
		if (update!=0) {
			System.out.println("Insert Data ");
		} else {
			System.out.println("failed to insert ");

		}
		
		
		
		
	}

}
