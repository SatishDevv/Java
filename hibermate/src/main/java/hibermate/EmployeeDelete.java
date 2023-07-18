package hibermate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDelete {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sati");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, 1);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if(employee!=null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}else {
			System.out.println("id is not found ");
		}
	}

}
