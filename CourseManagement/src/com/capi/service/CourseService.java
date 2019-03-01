package com.capi.service;

import java.util.List;

import com.capi.beans.Course;
import com.capi.exception.CourseException;

public interface CourseService {
	
	long inserCourse(Course course) ;
	List<Course> getAllCourses() throws CourseException ;
	boolean updateCourse(Course course) ;
	boolean deleteCourse(long courseId) ;
	boolean validate(Course course) ;

}
