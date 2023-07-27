package onetoone_bio.controller;

import java.util.Scanner;
import onetoone_bio.dao.PersonDao;
import onetoone_bio.dto.AadharCard;
import onetoone_bio.dto.Person;

public class MianController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		PersonDao personDao = new PersonDao();
		boolean condition = true ; 
		do {
			System.out.println("1.Insert \n2.update \n3.Delete \n4.FindBYID \n5.Find all \n6.Exit  ");
			int choose = scanner.nextInt();
			switch (choose) {
				case 1:{
					//get Person Details from the user.
					System.out.println("Enter your Name : ");
					String name = scanner.next();
					System.out.println("Enter the phone Number : ");
					long phone = scanner.nextLong();
					System.out.println("Enter the live Address : ");
					String address = scanner.next();
					//get AadharCard details From the Use.
					System.out.println("Enter the aadharCard Name : ");
					String aadharCard_name = scanner.next();
					System.out.println("Enter the aadharCard Address : ");
					String aadharCard_Address = scanner.next();
					//set the data form AadharCard class with help of setter Method.
					AadharCard aadharCard = new AadharCard();
					aadharCard.setName(aadharCard_name);
					aadharCard.setAddress(aadharCard_Address);
					//set the data form Person class with help of setter method Present inside the person class.
					Person person = new Person();
					person.setName(name);
					person.setPhone(phone);
					person.setAdderss(address);
					
					person.setAadharCard(aadharCard);
					aadharCard.setPerson(person);
					// Calling the save method.
					personDao.savePerson(person);
					break;
				}
				case 2 : {
					
					break;
				}
				case 3 : {
					System.out.println("Enter the ID to Delete the person : ");
					int id = scanner.nextInt();
					 boolean result =  personDao.deletePerson(id);
					 if (!result) {
						System.out.println("The Person id not Found to delete ");
					}else {
						System.out.println("Person is delete from the Database ");
					}
					break;
				}
				case 4 : {
					System.out.println("Enter the id to find the Person : ");
					int id = scanner.nextInt();
					personDao.findByPerson(id);
					break;
				}
				case 5 : {
					personDao.allPerson();
					break;
				}

				default:{
					System.out.println("Thank your Visting ");
					condition = false ; 
					break;
				}
			}
			
			
		}while (condition);
		
	}

}
