package prepasedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchData {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scanner = new Scanner(System.in);
		
		String classname = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/studentdb";
		String  user   = "root";
		String password = "toor";
		String Query = "select * from student where id = ?";
		
		
		Class.forName(classname);
	 	Connection connection =  DriverManager.getConnection(url,user,password);
	 	PreparedStatement preparedStatement =  connection.prepareStatement(Query);
	 	System.out.println("Enter Student ID  :  ");
	 	int id = scanner.nextInt();
	 	preparedStatement.setInt(1,id);
	 	
	 	ResultSet resultSet = preparedStatement.executeQuery();
	 	
	 	while (resultSet.next()) {
	 		System.out.println(resultSet.getInt(1) +" /t "+ resultSet.getString(2));
		}
	 	connection.close();
	 
	 	
		
	}

}
