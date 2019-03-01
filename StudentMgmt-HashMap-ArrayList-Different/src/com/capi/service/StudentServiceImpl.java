package com.capi.service;

import java.util.ArrayList;

import com.capi.beans.Student;
import com.capi.dao.StudentDao;
import com.capi.dao.StudentDaoImpl;
import com.capi.exception.StudentNotFound;

public class StudentServiceImpl implements StudentService {

	StudentDao sd=new StudentDaoImpl();
	
	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return sd.addStudent(student);
	}

	@Override
	public Student getStudent(int rn) throws StudentNotFound {
		// TODO Auto-generated method stub
		Student s=sd.getStudent(rn);
		if(s==null)
		{
			throw new StudentNotFound();
		}
		
		
		return sd.getStudent(rn);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return sd.updateStudent(student);
	}

	@Override
	public ArrayList<Student> getStudentList(String coursename) {
		// TODO Auto-generated method stub
		return sd.getStudentList(coursename);
	}

	@Override
	public Student removeStudent(int rn) {
		// TODO Auto-generated method stub
		return sd.removeStudent(rn);
	}

	@Override
	public boolean validateName(String name) {
		// TODO Auto-generated method stub
		return sd.validateName(name);
	}

	@Override
	public boolean validatePhone(String phone) {
		// TODO Auto-generated method stub
		return sd.validatePhone(phone);
	}

	@Override
	public Student ValidateDetails(Student stud) {
		// TODO Auto-generated method stub
		return sd.ValidateDetails(stud);
	}
	
	

}
