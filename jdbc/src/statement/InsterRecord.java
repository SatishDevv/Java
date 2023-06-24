package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsterRecord {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		boolean bol = false ; 
		String className = "com.mysql.cj.jdbc.Driver";
		String dataURL = "jdbc:mysql://127.0.0.1:3306/studentdb";
		String userName = "root";
		String password = "toor";
		
		String query = "INSERT INTO student_fist_years VALUES(4,'mayar', 'baramti', 80, 9075418976,'eng' )";
		//1.load or register driver
		Class.forName(className);
		//2.establish connection
		Connection connection =  DriverManager.getConnection(dataURL,userName,password);
		//3.create statement
		Statement statement =  connection.createStatement();
		//4.execute statement
		bol = statement.execute(query);
		if (!bol) {
			System.out.println("Inserted ");
		} else {
			System.out.println("SomeThink is worng ");
		}
		//5.CLOSE
		connection.close();
		
	}

}
