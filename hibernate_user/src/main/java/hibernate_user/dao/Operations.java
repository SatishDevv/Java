package hibernate_user.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_user.dto.User;

public class Operations {

	public EntityManager getEntityManager() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("satish");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void signUpUser(User user) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

	}

	public boolean loginUser(String email, String password) {
		EntityManager entityManager = getEntityManager();

		Query query = entityManager.createQuery("select user Form User user where email = ?1");
		query.setParameter(1, email);
		User user1 = (User) query.getSingleResult();
		if (password.equals(user1.getPassword())) {
			return true;
		}
		return false;
	}

}
