package com.capi.dao;

import java.util.List;

import com.capi.beans.Course;


public interface CourseDao {
	
	long insertCourse(Course course) ;
	List<Course> getAllCourses() ;
	boolean updateCourse(Course course) ;
	boolean deleteCourse(long courseid) ;

}
