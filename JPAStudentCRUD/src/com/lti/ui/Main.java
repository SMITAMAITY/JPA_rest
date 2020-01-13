package com.lti.ui;

import com.lti.model.Student;
import com.lti.service.StudentService;
import com.lti.service.StudentServiceImpl;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(25, "spooky", 89);
		StudentService service = new StudentServiceImpl();
		boolean result = service.addStudent(student);
		if(result)
		{
			System.out.println("Student "+student.getRollNumber() + " is added.");
			Student student2 = service.findStudentByRollNumber(student.getRollNumber());
			System.out.println(student2);
		}
		else
		{
			System.out.println("Student not added.");	
		}
	}

}
