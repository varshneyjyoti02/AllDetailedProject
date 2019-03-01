package com.capi.service;

import java.util.List;

import com.capi.beans.Course;
import com.capi.dao.CourseDao;
import com.capi.dao.CourseDaoI;
import com.capi.exception.CourseException;

public class CourseServiceI implements CourseService {

	CourseDao cd=new CourseDaoI();
	
	@Override
	public long inserCourse(Course course) {
		// TODO Auto-generated method stub
		return cd.insertCourse(course);
	}

	@Override
	public List<Course> getAllCourses() throws CourseException {
		// TODO Auto-generated method stub
		List<Course> li=cd.getAllCourses();
		if(li.size()==0)
		{
			throw new CourseException("");
		}
		
		return li;
	}

	@Override
	public boolean updateCourse(Course course) {
		// TODO Auto-generated method stub
		return cd.updateCourse(course);
	}

	@Override
	public boolean deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		return cd.deleteCourse(courseId);
	}

	@Override
	public boolean validate(Course course)  {
		// TODO Auto-generated method stub
		if(((course.getDuration()<0)||(course.getDuration()>100))||(course.getFees()<0d))
		{
			return false;
		}
		
		return true;
	}

}
