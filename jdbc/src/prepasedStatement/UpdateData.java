package prepasedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scanner = new Scanner(System.in);
		 final String CLASS_PATH = "com.mysql.cj.jdbc.Driver";
		 final String DATABASE_URL = "jdbc:mysql://localhost:3306/studentdb";
		 final String USER_NAME = "root";
		 final String PASSWORD = "toor";
		 String query = "update  student set name=?, marks=? where id = ?";
			
		Class.forName(CLASS_PATH);
		Connection connection =  DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
		PreparedStatement preparedStatement =  connection.prepareStatement(query);

		preparedStatement.setString(1,scanner.next());
		preparedStatement.setInt(2, scanner.nextInt());
		preparedStatement.setInt(3,scanner.nextInt());
		
		int count =  preparedStatement.executeUpdate();
		if (count!=0) {
			System.out.println("deleted");
		} else {
			System.out.println("Fieled");
		}
		
		connection.close();
		
		
		
		
		
		
		
		 
	}

}
