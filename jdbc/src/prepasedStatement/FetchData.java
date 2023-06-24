package prepasedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String classname = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbcdb";
		String Query = "select * from student where id = ?";
		
		
		Class.forName(classname);
	 	Connection connection =  DriverManager.getConnection(url);
	 	PreparedStatement preparedStatement =  connection.prepareStatement(Query);
	 	preparedStatement.setInt(1,2);
	 	
	 	ResultSet resultSet = preparedStatement.executeQuery();
	 	
	 	while (resultSet.next()) {
	 		
			
		}
		
	}

}
