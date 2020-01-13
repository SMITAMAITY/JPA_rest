package com.lti.dao;

import java.util.List;

import com.lti.model.Student;

public interface StudentDao {
  public int createStudent(Student student);
  public Student readStudent(int rollNumber);
  
  public void beginTransaction();
  public void rollbackTransaction();
  public void commitTransaction();
  
}
