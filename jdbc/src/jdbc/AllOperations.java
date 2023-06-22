package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class AllOperations {
	static String className = "com.mysql.cj.jdbc.Driver";
	static String url =  "jdbc:mysql://localhost:3306/jdbddb1?user=root&password=toor";
	
	void insterRecord() throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		String query = "insert into employee values(107 ,'Divakar',909014838,'sangamner ' )";
		
		Class.forName(className);
		Connection con = DriverManager.getConnection(url);
		Statement stmt =  con.createStatement();
		int count =stmt.executeUpdate(query);
		if (count!=0) {
			System.out.println("Recored is Instered : ");
		} else {
			System.err.println("Field to Insert ");
		}
		
		stmt.close();
		con.close();
		
		
	}
	
	
	void deleteRecord() throws ClassNotFoundException, SQLException {
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
	
	void fetchData() throws ClassNotFoundException, SQLException {
		String query = "Select * from employee";
		Class.forName(className);
		Connection conn = DriverManager.getConnection(url);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getLong(3));
			System.out.println(rs.getString(4));
			
		}
		rs.close();
		stmt.close();
		conn.close();
		
		
	}
	

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		AllOperations all = new AllOperations();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Insert 2.Delete 3.Update 4.Fetch  0.Exit");
		int input = sc.nextInt();
		while(input!=0) {
			
		switch (input) {
		case 1 :
			all.insterRecord();
			break;
		case 2 : 
			all.deleteRecord();
			break;
		case  3 :
			
			break;
		case 4 : 
			all.fetchData();
			break;
		
		}
			
			
		}
		
	}

}
