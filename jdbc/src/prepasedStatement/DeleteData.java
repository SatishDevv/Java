package prepasedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {
	public static void main (String arhs[]) throws ClassNotFoundException, SQLException {
		
		Scanner scanner = new Scanner(System.in);
		
		String classUrl = "com.mysql.cj.jdbc.Driver";
		String databaseurl = "jdbc:mysql://127.0.0.1:3306/studentdb";
		String userName = "root";
		String password = "toor";
		
		
		String query  = "Delete from student_fist_years where student_id= ? ";
		
		Class.forName(classUrl);
		Connection connection =  DriverManager.getConnection(databaseurl,userName , password );
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("Enter the Student ID : ");
		preparedStatement.setInt(1, scanner.nextInt());
		
		int data = preparedStatement.executeUpdate();
		 if (data!=0) {
			System.out.println("Recored Deleted ");
		} else {
			System.err.println("Recored Not Found  ");

		}
		 preparedStatement.close();
		 connection.close();
		
		 
		 
	}
}

/*
  	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scanner = new Scanner(System.in);
		 final String CLASS_PATH = "com.mysql.cj.jdbc.Driver";
		 final String DATABASE_URL = "jdbc:mysql://localhost:3306/studentdb";
		 final String USER_NAME = "root";
		 final String PASSWORD = "toor";
		 String query = "delete from student where id = ?";
		 

		Class.forName(CLASS_PATH);
		Connection connection = DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
		PreparedStatement preparedStatement =  connection.prepareStatement(query);	
		preparedStatement.setInt(1, scanner.nextInt());
		
		int count =  preparedStatement.executeUpdate();
		if (count !=0) {
			System.out.println("recored deleted :");
		} else {

			System.out.println("feild");
		}
		
		connection.close();
		
		
	}

 
 */