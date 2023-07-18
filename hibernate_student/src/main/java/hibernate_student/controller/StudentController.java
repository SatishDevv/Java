package hibernate_student.controller;

import java.util.Scanner;

import hibernate_student.dao.StudentDao;
import hibernate_student.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean condition = true;
		Student student = new Student();
		StudentDao studentDao = new StudentDao();
		while (condition) {
			System.out.println(
					"Enter Your chose: \n1.Insert Student \n2.Update Student \n3.Delete Student \n4.Find By Id \n5.Find All Student \n6.Exit");
			int chose = scanner.nextInt();
			switch (chose) {
				case 1: {
					System.out.println("Enter  your id : ");
					int id = scanner.nextInt();
					System.out.println("Enter  your name : ");
					String name = scanner.next();
					System.out.println("Enter  your age : ");
					int age = scanner.nextInt();
					System.out.println("Enter  your phone  : ");
					long phone = scanner.nextLong();
					System.out.println("Enter  your Address : ");
					String address = scanner.next();
					System.out.println("Enter  your marks : ");
					int marks = scanner.nextInt();
					System.out.println("Enter  your id : ");
					double precentages = scanner.nextDouble();
					student.setId(id);
					student.setName(name);
					student.setAge(age);
					student.setPhone(phone);
					student.setAddress(address);
					student.setMarks(marks);
					student.setPrecentages(precentages);
					studentDao.insertStudent(student);
					break;
				}
				case 2: {
					System.out.println("Enter  your Id To Update : ");
					int id = scanner.nextInt();
					student.setId(id);
					System.out.println("Chose the field  yout wan't to Update ");
					System.out.println("1.name \n2.age \n3.phone \n4.address \n.5marks \n6.precentages");
					int conditon = scanner.nextInt();
					switch (conditon ) {
					case 1:{
							System.out.println("Enter name to Update : ");
							student.setName(scanner.next());
							studentDao.updateStudent(id,student);
						break;
					}
					case 2 : {
						
						break;
					}
						

					default:
						break;
					}
					
	
					studentDao.updateStudent(id, student);
					break;
				}
				case 3: {
					System.out.println("Enter student Id to delete : ");
					int id = scanner.nextInt();
					studentDao.deleteStudent(id);
				}
				case 4: {
					System.out.println("Enter Student Id To Search : ");
					int id = scanner.nextInt();
					studentDao.findByIdStudent(id);
				}
				case 5 :{ 
					studentDao.findAllStudent();
					break;
				}
	
				case 6: {
					System.out.println("Thank you for Visiting ");
					condition = false;
	
				}
				
			}

		}

	}

}
