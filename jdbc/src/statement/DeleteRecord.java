package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String classPath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/studentdb";
		String user = "root";
		String password = "toor";
		
		String  query = "delete from student_fist_years where student_id = 4 ";
		
		Class.forName(classPath);
		Connection connection = DriverManager.getConnection(url,user,password);
		
		Statement statement = connection.createStatement();
		boolean bool = false ;
		bool = statement.execute(query);
		if (!bool) {
			System.out.println("Deleted");
		} else {
			System.out.println("! Not deleted ");
		}
		
		
	}


}
