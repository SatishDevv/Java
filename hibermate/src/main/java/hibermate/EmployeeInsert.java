package hibermate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class EmployeeInsert {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ID : ");
		employee.setId(scanner.nextInt());
		System.out.println("Enter name : ");
		employee.setName(scanner.next());
		System.out.println("Enter Address : ");
		employee.setAddress(scanner.next());
		System.out.println("Enter phone : ");
		employee.setPhone(scanner.nextLong());
		System.out.println("Enter Email : ");
		employee.setEmail(scanner.next());
		System.out.println("Enter Password : ");
		employee.setPassword(scanner.next());
		
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sati");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	

}
