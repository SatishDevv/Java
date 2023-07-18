package hibermate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeFetch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sati");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("Enter the id find employee : ");
		Employee employee = entityManager.find(Employee.class, scanner.nextInt() );
		System.out.println(employee);
		
	}
	

}
