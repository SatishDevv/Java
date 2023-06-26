package com.employee.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.employee.operation.Operation;
//main class of the employee DB 
public class MainClass {
	public static void main(String[] args) {
		 Operation operation = new Operation();	
		
		MainClass mainclass = new MainClass();
		
		try (Scanner scanner = new Scanner(System.in);) {
			boolean isRunning = true;

			while (isRunning) {
				System.out.println("Select Option to perform Operation : ");
				System.out.println("1.Insert 2.Fetch 3.Select By ID 4.Delete 5.Update 6.Exit ");
				int option = scanner.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter the Employee ID :  ");
					int EMPID = scanner.nextInt();
					System.out.println("Enter the Employee First Name :  ");
					String Fname = scanner.next();
					System.out.println("Enter the Employee Last Name :  ");
					String Lname = scanner.next();
					System.out.println("Enter the Employee Phone Number :  ");
					Long PhoneNo = scanner.nextLong();
					System.out.println("Enter the Employee Salary :  ");
					Double Salary = scanner.nextDouble();
					System.out.println("Enter the Employee Address :  ");
					String Address = scanner.next();
					System.out.println("Enter the Employee Position :  ");
					String Position = scanner.next();
					System.out.println("Enter the Employee ManagerID :  ");
					int ManagerID = scanner.nextInt();
					//1st way to load data into Employee variables.
//					Employee employee = new Employee(scanner.nextInt(), scanner.next(), scanner.next(),scanner.nextLong(), scanner.nextDouble(), scanner.next(), scanner.next(), scanner.nextInt());
//					operation.insertEmployee(employee);
					
					/* 2nd way add */
					operation.insertEmployee(new Employee(EMPID, Fname, Lname,PhoneNo,Salary, Address, Position, ManagerID));
					break;
				case 2:
					operation.fetchData();
					break;
				case 3:
					System.out.println("Enter the Employee ID To Search : ");
					operation.getEmployeeById(scanner.nextInt());
					break;
				case 4:
					System.out.println("Enter the Employee to Delete ");
					operation.deleteEmployeeByID(scanner.nextInt());
					break;
				case 5:
					System.out.println("Enter the Employee to Update ");
					 EMPID = scanner.nextInt();
					boolean isFound = operation.getEmployeeById(EMPID);
					if(isFound) {
						System.out.println("Enter the Employee First Name :  ");
						Fname = scanner.next();
						System.out.println("Enter the Employee Last Name :  ");
						Lname = scanner.next();
						System.out.println("Enter the Employee Phone Number :  ");
						PhoneNo = scanner.nextLong();
						System.out.println("Enter the Employee Salary :  ");
						Salary = scanner.nextDouble();
						System.out.println("Enter the Employee Address :  ");
						Address = scanner.next();
						System.out.println("Enter the Employee Position :  ");
						Position = scanner.next();
						System.out.println("Enter the Employee ManagerID :  ");
						ManagerID = scanner.nextInt();
						Employee employee = new Employee(EMPID, Fname, Lname, PhoneNo, EMPID, Address, Position, ManagerID);
						operation.updateEmployee(employee);
					}
						
					break;

				case 6:
					isRunning = false;
					System.out.println("Thank you Visiting");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println(e);
			throw new RuntimeException();
		}

	}
	
	
}
