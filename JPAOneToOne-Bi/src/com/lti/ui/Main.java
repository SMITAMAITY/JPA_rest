package com.lti.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.lti.model.Address;
import com.lti.model.Student;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(200,"Math",70);
		Address address = new Address("Mumbai","40001");
		student.setAddress(address);
		
		Student student1 = new Student(101,"MakarSankranti",69);
		Address address1 = new Address(" Navi Mumbai","400709");
		student1.setAddress(address1);
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager entityManager = factory.createEntityManager();
		
	
			
		entityManager.getTransaction().begin();
		//entityManager.persist(address);
		entityManager.persist(student);
	
		//entityManager.persist(address1);
		entityManager.persist(student1);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
}
	
}
