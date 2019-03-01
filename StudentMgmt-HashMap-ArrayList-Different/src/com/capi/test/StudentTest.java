package com.capi.test;

import org.junit.Test;

import com.capi.beans.Student;
import com.capi.exception.StudentNotFound;
import com.capi.service.StudentService;
import com.capi.service.StudentServiceImpl;

public class StudentTest {
	StudentService service = new StudentServiceImpl();
	@Test(expected=com.capi.exception.StudentNotFound.class)
	public void test() throws StudentNotFound {
		//Student student=new Student(199, "jyoti", "java", 20,  "7217499041");
		service.getStudent(199);
		
		
	}
	@Test
	public void test1() throws StudentNotFound {
		Student student=new Student(199, "jyoti", "java", 20,  "7217499041");
		service.addStudent(student);
        service.getStudent(student.getRollno());
		
	}

}
