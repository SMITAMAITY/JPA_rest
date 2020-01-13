package com.lti.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.omg.Messaging.SyncScopeHelper;

import com.lti.model.Student;

public class Main {

	public static void main(String[] args) {
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager entityManager = factory.createEntityManager();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Choices ");
		System.out.println("1. Save or Insert ");
		System.out.println("2. Find or Select ");
		System.out.println("3. Remove or Delete ");
		System.out.println("4. Merge or Update ");
		
		int id;
		String name;
		double score;
		
		Student student= null;
		
		int ch=s.nextInt();
		switch(ch)
		{
		case 1 :
			System.out.print("Enter id: ");
			id =s.nextInt();
			
			System.out.print("Enter name: ");
			name =s.next();
			
			System.out.print("Enter score: ");
			score =s.nextDouble();
			
			student = new Student(id, name, score);
			entityManager.getTransaction().begin();
			entityManager.persist(student);
			entityManager.getTransaction().commit();
			break;
		case 2:
			System.out.print("Enter id to search: ");
			id  = s.nextInt();
			student = entityManager.find(Student.class,id);
			System.out.println(student);
			break;
		case 3:
			System.out.print("Enter id to search: ");
			id  = s.nextInt();
			student = entityManager.find(Student.class,id);
			entityManager.getTransaction().begin();
			entityManager.remove(student);
			entityManager.getTransaction().commit();
			break;
		case 4:
			System.out.print("Enter id to update: ");
			id = s.nextInt();
			student = entityManager.find(Student.class,id);
			
			System.out.println("Enter name to change: ");
			name = s.next();
			student.setStudentName(name);
			
			entityManager.getTransaction().begin();
			entityManager.merge(student);
			entityManager.getTransaction().commit();
			break;
		
		default:
			s.close();
			System.exit(0);
			
		}
		
	
		
		
		
		

	}

	

}
