package com.capi.service;

import java.util.ArrayList;

import com.capi.beans.Student;
import com.capi.exception.StudentNotFound;

public interface StudentService {

	public int addStudent(Student student) ;
	public Student getStudent(int rn) throws StudentNotFound ;
	public Student updateStudent(Student student) ;
	public ArrayList<Student> getStudentList(String coursename) ;
	public Student removeStudent(int rn)  ;
	public boolean validateName(String name)  ;
	public boolean validatePhone(String phone)  ;
	public Student ValidateDetails(Student stud) ;
	
}
