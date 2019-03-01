package com.capi.test;

import org.junit.Before;
import org.junit.Test;

import com.capi.beans.Course;
import com.capi.exception.CourseException;
import com.capi.service.CourseService;
import com.capi.service.CourseServiceI;

public class CourseTest {
	CourseService service=new CourseServiceI();

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected=com.capi.exception.CourseException.class)
	public void test() throws CourseException {
		service.getAllCourses();
	}
	
	@Test
	public void test1() throws CourseException {
		Course course=new Course(101, "java", 100, 4);
		service.inserCourse(course);
		service.getAllCourses();
	}
	

}
