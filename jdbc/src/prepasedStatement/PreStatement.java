package prepasedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreStatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scanner = new Scanner(System.in);
		
		int id = scanner.nextInt();
		String name  = scanner.next();
		Double marks = scanner.nextDouble();
		long phone = scanner.nextLong();
		String address = scanner.next();
		
		 final String CLASS_PATH = "com.mysql.cj.jdbc.Driver";
		 final String DATABASE_URL = "jdbc:mysql://localhost:3306/studentdb";
		 final String USER_NAME = "root";
		 final String PASSWORD = "toor"; 
		 
		 
		 
		 
		 String Query = "INSERT INTO student VALUES(?,?,?,?,?)";
		
		Class.forName(CLASS_PATH);
		Connection con = DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
		PreparedStatement preparedStatement =  con.prepareStatement(Query);
		
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setDouble(3, marks);
		preparedStatement.setLong(4, phone);
		preparedStatement.setString(5, address);
		
		
		preparedStatement.execute();
		System.out.println("inserted");
		con.close();
	
		
		
		
		
		
		
		
		
		
	}

}
