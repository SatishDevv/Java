package onetoone_bio.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetoone_bio.dto.Person;

public class PersonDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("satish");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	// save the person 
	
	public  void savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}//ends savaPerson().
	
	//Update the Person 
	public void updatePerson(Person person) {
		findByPerson(0); 
	}
	
	//Delete the Person By ID 
	public boolean deletePerson(int id ) {
		Person person = entityManager.find(Person.class, id);
		if (person!=null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true ; 
		}
		return false;
	}
	
	
	
	
//find the person
	public  void findByPerson(int id ) {
		Person person =  entityManager.find(Person.class, id);
		System.out.print(person);
	}//ends findPerson() by ID.
	
	
	//Fetch all the data.
	public void allPerson() {
		Query query =  entityManager.createQuery("Select person from Person person");
		 List<Person> list =  query.getResultList();
		 Iterator<Person> ans = list.iterator(); 
		if (ans != null) {
			 while (ans.hasNext()) {
					Person person = ans.next();
					System.out.println(person);
				}
		}else{
			System.out.println("Database Is Empty : ");
		}
	}//ends of allPerdon()	
}
