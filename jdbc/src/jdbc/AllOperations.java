package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class AllOperations {
	class allo{
		public static final String className = "com.mysql.cj.jdbc.Driver";
		public static final String url =  "jdbc:mysql://localhost:3306/jdbddb1?user=root&password=toor";
		
		
	}
	

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		AllOperations all = new AllOperations();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Insert 2.Delete 3.Update 4.Fetch  0.Exit");
		int input = sc.nextInt();
		while(input!=0) {
			
		switch (input) {
		case 1 :
			
			break;
		case 2 : 
			
			break;
		case  3 :
			
			break;
		case 4 : 
			
			break;
		
		}
			
			
		}
		
	}

}
