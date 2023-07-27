package otm_mto_bio.controller;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import otm_mto_bio.dto.College;
import otm_mto_bio.dto.Student;

public class MainController {
	
	public static void main(String[] args) {
		College college = new College() ;
		college.setName("FC" );
		college.setLoctions("pune");
		college.setFees(123000);
		
		Student student = new Student();
		student.setName("Satish");
		student.setPhone(9075541);
		student.setCollege(college);
		
		
		Student student1 = new Student();
		student1.setName("Satish");
		student1.setPhone(9075541);
		student1.setCollege(college);
		Student student2 = new Student();
		student2.setName("Satish");
		student2.setPhone(9075541);
		student2.setCollege(college);
		
		
		List<Student> list = new LinkedList<Student>();
		list.add(student);
		list.add(student1);
		list.add(student2);
		college.setStudents(list);
		
		
		
		
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("satish");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(college);
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityTransaction.commit();
		
		
		
	}

}
