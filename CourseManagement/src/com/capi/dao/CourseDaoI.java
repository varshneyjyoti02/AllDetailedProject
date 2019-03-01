package com.capi.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import com.capi.beans.Course;

public class CourseDaoI implements CourseDao {
	
	HashMap<Long,Course> hm=new HashMap<>();

	@Override
	public long insertCourse(Course course) {
		// TODO Auto-generated method stub
		long id=(long) (Math.random()*1000);
		course.setCourseId(id);
		hm.put(id, course);
		return id;
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		Collection <Course> studList = hm.values();
		List<Course> li=new LinkedList<>();
		Iterator<Course> lt = studList.iterator();
		while (lt.hasNext()) {
			Course s = lt.next();
			li.add(s);
			
		}
		return li;
	}

	@Override
	public boolean updateCourse(Course course) {
		for(Entry<Long,Course> entry:hm.entrySet())
		{
			if(entry.getValue().getCourseTitle().equals(course.getCourseTitle()))
			{
				Course c=entry.getValue();
				c.setDuration(course.getDuration());
				c.setFees(course.getFees());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteCourse(long courseid) {
		// TODO Auto-generated method stub
		hm.remove(courseid);
		return true;
	}

}
