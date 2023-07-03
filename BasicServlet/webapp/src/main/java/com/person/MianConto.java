package com.person;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MianConto {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Scanner scanner = new Scanner(System.in);
		PersonCRUD personCRUD = new PersonCRUD();
		Person person = new Person();
		boolean isRunning = true ; 
		while(isRunning) {
			System.out.println("Enter your chose : \n1.Insert \n2.Update \n3.Delete \n4.find \n5. Find All  \n. Exit");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("Enter yout id  : ");
				int id = scanner.nextInt();
				System.out.println("Enter yout name  : ");
				String name = scanner.next();
				System.out.println("Enter yout phoneno  : ");
				Long Phoneno = scanner.nextLong();
				System.out.println("Enter yout address  : ");
				String Address = scanner.next();	
				
				person.setPerson_ID(id);
				person.setPerson_name(name);
				person.setPerson_phone(Phoneno);
				person.setPerson_address(Address);
				personCRUD.insertPerson(person);
				break;
			case 2 :{
				
				break;
			}
				
			case 3 :{
				System.out.println("Enter ID You Want to Delete : ");
				id = scanner.nextInt();
				personCRUD.deletePerson(id);
				
				break;
			}
			case 4 : {
				
			}
			case 5  : {
				
			}
			default:
				isRunning= false;
				System.out.println("Thank your Visiting");
			}

		}
		
	}
}
