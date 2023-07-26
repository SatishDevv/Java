package onetoone_bio.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_bio.dto.AadharCard;
import onetoone_bio.dto.Person;

public class MianController {
	
	
	public static void main(String[] args) {
		
		AadharCard aadharCard = new AadharCard();
		aadharCard.setName("satish");
		aadharCard.setAddress("pune");
		
		Person person = new Person();
		person.setName("satish");
		person.setPhone(9075414838l);
		person.setAdderss("pune");
		
		person.setAadharCard(aadharCard);
		aadharCard.setPerson(person);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("satish");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
			
//		entityTransaction.begin();
//		entityManager.persist(person);
//		entityManager.persist(aadharCard);
//		
//		entityTransaction.commit();
//		
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		Person person2 =  entityManager.find(Person.class, id);
		System.out.println(person2);
		
		
		
	}
	
	

}
