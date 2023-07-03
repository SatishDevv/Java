package com.jdbc.callable;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class MainCompanyClass {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
		FileInputStream fileInputStream = new FileInputStream("Application.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		
		Class.forName(properties.getProperty("CLASS_NAME"));
		
		Connection connection = DriverManager.getConnection(properties.getProperty("DATABASE_PATH"),properties.getProperty("USER_NAME"),properties.getProperty("PASSWORD"));
		return connection;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		boolean  isCondition = true; 
		do {
			System.out.println("1.insert 2.fatchCompnayById ");
			int key = scanner.nextInt();
			switch (key) {
			case 1: {
				Connection connection = getConnection();
				CallableStatement callableStatement =  connection.prepareCall("call companydb.new_procedure(?,?,?,?)");
				System.out.println("Enter company ID");
				callableStatement.setInt(1, scanner.nextInt());
				System.out.println("Enter company Name");
				callableStatement.setString(2, scanner.next());
				System.out.println("Enter company GST");
				callableStatement.setInt(3, scanner.nextInt());
				System.out.println("Enter company address");
				callableStatement.setString(4, scanner.next());
				int update = callableStatement.executeUpdate();
				 if (update!=0) {
					System.out.println("Inserted");
				} else {
					System.out.println("failed");
				}
				 connection.close();
			}	 
				break;
			case 2 : {
				Connection connection = getConnection();
				CallableStatement callableStatement = connection.prepareCall("call companydb.fetchCompanyById(?)");
				System.out.println("Enter id to Search: ");
				callableStatement.setInt(1, scanner.nextInt());
				ResultSet resultSet = callableStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getInt(3));
					System.out.println(resultSet.getString(4));
				}
				connection.close();
				
			}
			

			default:
				break;
			}

		} while (isCondition);		
	}

}
