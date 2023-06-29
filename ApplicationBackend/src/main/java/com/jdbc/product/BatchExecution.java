package com.jdbc.product;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class BatchExecution {
	
	public static Connection getConnection() throws IOException, SQLException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("Application.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		Class.forName(properties.getProperty("CLASS_NAME"));
		Connection connection	= DriverManager.getConnection(properties.getProperty("DATABASE_PATH"),properties.getProperty("USER_NAME"),properties.getProperty("PASSWORD"));
		return connection;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
//		BatchExecution batchExecution= new BatchExecution();
		
		
		Product product1 = new Product(3, "AC", 10000, "Sony");
		Product product2 = new Product(4, "Watch", 20000, "MI");
		
		
		ArrayList<Product> list = new ArrayList<Product>(); 
		list.add(product1);
		list.add(product2);
			Connection connection = BatchExecution.getConnection();
			System.out.println("connected");
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into product values(?,?,?,?)");
			for (Product product : list) {
				preparedStatement.setInt(1, product.getProduct_id());
				preparedStatement.setString(2, product.getProduct_name());
				preparedStatement.setInt(3, product.getProduct_price());
				preparedStatement.setString(4, product.getProduct_manu_fac());
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
			System.err.println("Success?");
			connection.close();
		
	}

}
