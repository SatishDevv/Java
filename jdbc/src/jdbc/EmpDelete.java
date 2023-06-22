package jdbc;

import java.sql.*;

public class EmpDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String className = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbddb1?user=root&password=toor"; 
		String query = "Delete from employee where id = 102 ";
		
		Class.forName(className);
		Connection con = DriverManager.getConnection(url);
		Statement stmt = con.createStatement();
		int result =  stmt.executeUpdate(query);
		
		if(result !=0) { 
			System.out.println("Record is Deleted");
		}else {
			System.out.println("Field to Deletes ");
		}
		
		con.close();
	}

}
