package hibernate_student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import hibernate_student.dto.Student;

public class StudentDao {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("satish");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void insertStudent(Student student) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

	}

	public void updateStudent(int id , Student student) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	
		Student dbStudnet =  entityManager.find(Student.class, id);
		if(dbStudnet != null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			
		}else {
			System.out.println("Record is not found ");
		}

	}

	public void deleteStudent(int id) {

		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student dbStudnet =  entityManager.find(Student.class, id);
		if (dbStudnet != null) {
			entityTransaction.begin();
			entityManager.remove(dbStudnet);
			entityTransaction.commit();
		} else {
			System.out.println("Record is not found ");
		}

	}

	public void findByIdStudent(int id) {
		EntityManager entityManager =  getEntityManager();
		Student student = entityManager.find(Student.class, id);
		 System.out.println(student);
	}

	public void findAllStudent() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("Select student from Student student");
		List<Student> list = query.getResultList();
		System.out.println(list +"\n");
	}

}
