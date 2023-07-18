package hibermate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sati");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee = entityManager.find(Employee.class, 1);
		if(employee != null ) {
			
			employee.setAddress("sangamner");
			
			
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
		}
		
	}
	
}

