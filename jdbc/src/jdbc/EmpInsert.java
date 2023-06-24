package jdbc;

import java.sql.*;


public class EmpInsert {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1 load the Driver 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//2 establish connection 
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbddb1", "root", "toor");
		
		//3 Create  Statement 
		Statement stm = con.createStatement();
		
		//4 
		int count = stm.executeUpdate("Insert into employee values (113,'satish',9075414838,'sangamner')");
		if(count!=0) {
			System.out.println("record Insert");
		}
		else{
			System.out.println("Failed to Insert");
		}
		
		//5 close the Connection. 
		con.close();
		
	}

}
