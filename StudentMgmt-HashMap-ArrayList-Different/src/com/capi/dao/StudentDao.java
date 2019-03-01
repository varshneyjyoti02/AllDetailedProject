package com.capi.dao;

import java.util.ArrayList;

import com.capi.beans.Student;

public interface StudentDao {
	
	public int addStudent(Student student) ;
	public Student getStudent(int rn) ;
	public Student updateStudent(Student student) ;
	public ArrayList<Student> getStudentList(String coursename) ;
	public Student removeStudent(int rn) ;
	public boolean validateName(String name) ;
	public boolean validatePhone(String phone);
	public Student ValidateDetails(Student stud);

}
