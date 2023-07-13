package student_addmision;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class SignUpJdbc {
	
	public Connection getConection() throws ClassNotFoundException, SQLException {
		final String CLASS_PATH = "com.mysql.cj.jdbc.Driver";
	    final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/studentdb";
	    final String USER_NAME = "root";
		final String PASSWORD = "toor"; 
		
		Class.forName(CLASS_PATH);
		Connection connection = DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
		return connection;
	}//end of Connection method.
	public int insertStudent(Student student ) throws ClassNotFoundException, SQLException {
		
		Connection connection = getConection();
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student VALUES (?,?,?,?,?,?,?,?,?,?)");
		preparedStatement.setInt(1, student.getId());
		preparedStatement.setString(2, student.getName());
		preparedStatement.setString(3, student.getFname());
		preparedStatement.setString(4, student.getMname());
		preparedStatement.setInt(5, student.getAge());
		preparedStatement.setLong(6, student.getPhone());
		preparedStatement.setString(7, student.getEmail());
		preparedStatement.setString(8, student.getPassword());
		preparedStatement.setString(9, student.getSchoole());
		preparedStatement.setLong(10, student.getFee());
		int soutn =  preparedStatement.executeUpdate();
		connection.close();
		return soutn; 
	}
	

}
