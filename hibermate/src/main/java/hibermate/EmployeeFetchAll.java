package hibermate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.sql.ResultSet;
import java.util.*;

import antlr.collections.List;

public class EmployeeFetchAll {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sati");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("SELECT employee from Emoloyee employee");
		java.util.List<Employee> employees =    query.getResultList();
		System.out.println(employees);
		
	}

}
