package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.lti.model.Student;
import com.lti.utils.JpaUtils;

public class StudentDaoImpl implements StudentDao {
	private EntityManager entityManage;
	public StudentDaoImpl(){
		entityManage = JpaUtils.getEntityManager();
	}

	@Override
	public int createStudent(Student student) {
		entityManage.persist(student);
		return 1;
		
		
	}

	@Override
	public Student readStudent(int rollNumber) {
		return entityManage.find(Student.class, rollNumber);
	}
	
	
	
	@Override
	public void beginTransaction()
	{
		entityManage.getTransaction().begin();
	}
	@Override
	public void rollbackTransaction()
	{
		entityManage.getTransaction().rollback();
	}
	@Override
	public void commitTransaction()
	{
		entityManage.getTransaction().commit();
	}

	
	
	
	

	
	}

