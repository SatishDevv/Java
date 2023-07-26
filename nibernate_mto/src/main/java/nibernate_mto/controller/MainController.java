package nibernate_mto.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import nibernate_mto.dto.Company;
import nibernate_mto.dto.Emoloyee;

public class MainController {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Company company = new Company();
		company.setId(1);
		company.setName("INFOSYS");
		company.setLocation("pune");
		company.setGst("iour985");
		
		Emoloyee emoloyee = new Emoloyee();
		emoloyee.setId(1);
		emoloyee.setName("satish");
		emoloyee.setAddress("punr");
		emoloyee.setPhone(9075);
		emoloyee.setCompany(company);
		
		Emoloyee emoloyee1 = new Emoloyee();
		emoloyee1.setId(2);
		emoloyee1.setName("satish");
		emoloyee1.setAddress("punr");
		emoloyee1.setPhone(9075);
		emoloyee1.setCompany(company);
		
		Emoloyee emoloyee2 = new Emoloyee();
		emoloyee2.setId(3);
		emoloyee2.setName("satish");
		emoloyee2.setAddress("punr");
		emoloyee2.setPhone(9075);
		emoloyee2.setCompany(company);
		
//		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("satish");
//		 EntityManager emEntityManager = entityManagerFactory.createEntityManager();
//		 EntityTransaction eTransaction = emEntityManager.getTransaction();
//		eTransaction.begin();
//		emEntityManager.persist(company);
//		emEntityManager.persist(emoloyee);
//		emEntityManager.persist(emoloyee1);
//		emEntityManager.persist(emoloyee2);
//		eTransaction.commit();
		 
		 
		
	}

}
