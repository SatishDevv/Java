package com.userpage.user;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainUserPage {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Scanner scanner = new Scanner(System.in);
		UserPage userPage = new UserPage();
		UserPageOperations userPageOperations = new UserPageOperations();
		boolean isCondition = true ;
		
		do {
			System.out.print("enter your Choise : ");
			System.out.println("\n1.signup \n2.login \n3.Exit");
			int choise =scanner.nextInt();
			switch (choise) {
			case 1: {
					System.out.println("Enter your id ");
					int id = scanner.nextInt();
					System.out.println("Enter your name :");
					String name = scanner.next();
					System.out.println("Enter your Phoneno : ");
					Long phoneNo = scanner.nextLong();
					System.out.println("Enter yout Email : ");
					String email = scanner.next();
					System.out.println("Enter yout Password : ");
					String password = scanner.next();	
					
			}	
				break;
			case 2 : {
				 	
			}

			default:
				isCondition = false ;
			}
			
			
		} while (isCondition);
	}

}
