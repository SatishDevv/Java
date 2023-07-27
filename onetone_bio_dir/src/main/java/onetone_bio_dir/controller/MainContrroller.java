package onetone_bio_dir.controller;

import java.util.Scanner;

import onetone_bio_dir.dto.AadharCard;
import onetone_bio_dir.dto.Person;

public class MainContrroller {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Person person = new Person();
		AadharCard aadharCard = new AadharCard() ; 
		
		boolean condition = true ;
		while (condition) {
			System.out.println("1.Inster the data  : ");
			int key = scanner.nextInt();
			
			switch (key) {
			case 1 :{
				System.out.println("Enter the name :");
				String name = scanner.next();
				System.out.println("Enter the last Name : ");
				String lname = scanner.next();
				System.out.println("Enter the  emial  : ");
				String email= scanner.next();
				System.out.println("Enter the phone no : ");
				long phone = scanner.nextLong();
				System.out.println("Enter address : ");
				String address  = scanner.next();
				System.out.println("Enter the Gender : ");
				String gender = scanner.next();
				
				person.setName(name);
				person.setLast_name(lname);
				person.setEmail(email);
				person.setAddress(address);
				person.setPhone(phone);
				
				aadharCard.setName(name);
				aadharCard.setLast_name(lname);
				aadharCard.setPhone(phone);
				aadharCard.setAdress(address);
				
				person.setAadharCard(aadharCard);
				aadharCard.setPerson(person);
				//Calling a Methode form the main Method.
				
				
					
				break;
			}
			case 2 : 

			default:
				condition = false ; 
				break;
			}
			
		}
	}

}
