package nibernate_mto.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import nibernate_mto.dto.Company;
import nibernate_mto.dto.Emoloyee;

public class CompanyDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("satish");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	void saveEmployee(Emoloyee emoloyee ,int company_id ) {
		Company company = entityManager.find(Company.class, company_id);
		if (company!=null) {
			emoloyee.setCompany(company);
			entityTransaction.begin();
			entityManager.persist(emoloyee);
			entityTransaction.commit();
		}
	}
	

}
