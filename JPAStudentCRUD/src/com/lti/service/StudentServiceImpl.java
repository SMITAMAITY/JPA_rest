package com.lti.service;

import com.lti.dao.StudentDao;
import com.lti.dao.StudentDaoImpl;
import com.lti.model.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao;
	public StudentServiceImpl(){
		dao= new StudentDaoImpl();
}
	

	@Override
	public boolean addStudent(Student student) {
		dao.beginTransaction();
		int result = dao.createStudent(student);
		if(result == 1){
			dao.commitTransaction();
			return true;
		  
		}
		else{
			
			dao.rollbackTransaction();
			return false;
		}
	}

	@Override
	public Student findStudentByRollNumber(int rollNumber) {

		return dao.readStudent(rollNumber);
	}

}
