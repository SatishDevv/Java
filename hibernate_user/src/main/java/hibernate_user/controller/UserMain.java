package hibernate_user.controller;

import java.util.Scanner;

import hibernate_user.dao.Operations;
import hibernate_user.dto.User;

public class UserMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		User user = new User();
		Operations operations = new Operations();
		boolean condition = true;
		while (condition) {
			System.out.println("1.SignUp \n2.login");
			int chose = scanner.nextInt();
			switch (chose) {
			case 1: {
				System.out.println("Enter the Id : ");
				int id = scanner.nextInt();
				System.out.println("Enter the name : ");
				String name = scanner.next();
				System.out.println("Enter the phone : ");
				long phone = scanner.nextLong();
				System.out.println("Enter the Email : ");
				String email = scanner.next();
				System.out.println("Enter the Password : ");
				String Password = scanner.next();

				user.setId(id);
				user.setName(name);
				user.setPhone(phone);
				user.setEmail(email);
				user.setPassword(Password);

				operations.signUpUser(user);

			}
				break;
			case 2 :{
				System.out.println("Enter the Email : ");
				String email = scanner.next();
				System.out.println("Enter the Password : ");
				String Password = scanner.next();
				
				boolean result = operations.loginUser(email,Password);
				if(result) {
						
				}else {
					System.out.println("Faiels");
				}
					
				
			}

			default:
				break;
			}

		}

	}

}
