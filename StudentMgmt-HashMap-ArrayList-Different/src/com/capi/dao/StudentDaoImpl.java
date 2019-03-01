package com.capi.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capi.beans.Student;
public class StudentDaoImpl implements StudentDao{
	
	HashMap<Integer,Student> hm=new HashMap<>();

	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		int rollNo=(int) (Math.random()*1000);
		student.setRollno(rollNo);
		hm.put(rollNo, student);
		
		return rollNo;
	}

	@Override
	public Student getStudent(int rn) {
		// TODO Auto-generated method stub
Student student=hm.get(rn);
return student;
		
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		hm.put(student.getRollno(), student);
		
		return student;
	}

	@Override
	public ArrayList<Student> getStudentList(String coursename) {
		// TODO Auto-generated method stub
		

		Collection <Student> studList = hm.values();
		ArrayList <Student> students = new ArrayList<Student>();
		Iterator<Student> itr = studList.iterator();
		while(itr.hasNext())
		{
			Student s = itr.next();
			if(s.getCourseName().equals(coursename))
			{
				students.add(s);
			}
		}
		return students;
		
	}

	@Override
	public Student removeStudent(int rn) {
		// TODO Auto-generated method stub
		Student s=hm.remove(rn);
		return s;
	}

	@Override
	public boolean validateName(String name) {
		// TODO Auto-generated method stub

		Pattern pat = Pattern.compile("[A-Z][a-z]{3,}");
		Matcher mat = pat.matcher(name);
		return mat.matches();
	}

	@Override
	public boolean validatePhone(String phone) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("[7-9][0-9]{9}");
		Matcher mat = pat.matcher(phone);
		return mat.matches();
	}

	@Override
	public Student ValidateDetails(Student stud) {
		// TODO Auto-generated method stub

		if(validateName(stud.getName()) && validatePhone(stud.getMobileNo()))
			return stud;
		else
		
		return null;
	}

}
