package CurdOperations;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Operations {

	public void studentInsert() {
		
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter Student Rollno");
		student.setStudent_Id(scanner.nextInt());
		System.out.println("Enter the Student name : ");
		student.setStudent_Name(scanner.next());
		System.out.println("Enter the Student LastName : ");
		student.setStudent_LName(scanner.next());
		System.out.println("Enter the student Email : ");
		student.setStudent_Email(scanner.next());
		System.out.println("enter your Password : ");
		student.setStudent_Passwrd(scanner.next());
		System.out.println("enter your Marks : ");
		student.setStudent_Mark(scanner.nextInt());
	
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("sati");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();	
	}//End of the studentInsert()

	public void studentUpdate() {
		
	}

	
	
	
	
}
