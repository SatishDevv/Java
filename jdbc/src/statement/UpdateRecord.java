package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String className = "com.mysql.cj.jdbc.Driver";
		String dataURL = "jdbc:mysql://127.0.0.1:3306/studentdb";
		String userName = "root";
		String password = "toor";
		
		String query = "Update student_fist_years set student_name ='Divakar', student_makrs='89' where student_id = 3  " ;
		boolean bol = false ; 
		
		Class.forName(className);
		Connection connection = DriverManager.getConnection(dataURL,userName,password);
		Statement statement = connection.createStatement();
		
		bol = statement.execute(query);
		if (!bol) {
			System.out.println("Recored Updated ");
		} else {
			System.out.println("Failed to Updates  ");
		}
		
		connection.close();
	}

}
