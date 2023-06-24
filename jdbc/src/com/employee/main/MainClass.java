package com.employee.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.employee.operation.Operation;

//main class of the employee DB 
public class MainClass {
	public static void main(String[] args)  {

		Operation operation = new Operation();
		Scanner sc = new Scanner(System.in);
		Scanner sci = new Scanner(System.in);
		try {
			boolean isRunning = true;

			while (isRunning) {
				System.out.println("Select Option to perform Operation : ");
				System.out.println("1.Insert 2.Fetch 3.Select By ID 4.Delete 5.Update 6.Exit ");
				int option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter Employee EMPID, Fname, LName, PhoneNo, Salary, Address, Position, ManagerID");
					operation.insertEmployee(new Employee(sci.nextInt() ,sc.next(), sc.next(), sci.nextLong(), sci.nextDouble(),sc.next(), sc.next(), sci.nextInt()));
					break; 	
				case 2:	

					break;
				case 3: 
					
					break;
				case 4:

					break;
				case 5:

					break;

				case 6:
					isRunning = false;
					System.out.println("Thank you Visiting");
					break;
				}
			}

		}catch (Exception e) {
			System.out.println(e);
			throw new RuntimeException();
		} 
		
	}

}
