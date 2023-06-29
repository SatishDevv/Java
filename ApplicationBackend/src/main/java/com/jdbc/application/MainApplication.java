package com.jdbc.application;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainApplication {
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Scanner scanner = new Scanner(System.in);
		boolean isCondition = true ;
		UserOperations userOperations = new UserOperations();
		
		do {
			System.out.println("Enter your chose : \n1. signUp \n2. Login \n3. Exit");
			int value = scanner.nextInt();
			switch (value) {
			case 1:{
				System.out.println("Enter User ID : ");
				int ID = scanner.nextInt();
				System.out.println("Enter User Name : ");
				String name = scanner.next();
				System.out.println("Enter your Phone No");
				Long phone = scanner.nextLong();
				System.out.println("Enter User ID : ");
				String email = scanner.next();
				System.out.println("Enter User ID : ");
				String password  = scanner.next();
				User user = new User(ID,name,phone,email,password);
				
				userOperations.signUP(user);
				
				
			}
				break;
			case 2 : {
				
			}
			break;
			case 3:{
				isCondition = false ; 
			}
				break;
			}
			
			
		} while (isCondition);
		
		
	}

}
