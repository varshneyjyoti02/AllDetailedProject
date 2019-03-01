package com.capi.beans;

public class Course {
	
	private long courseId;
	private String courseTitle;
	private double fees;
	private int duration;
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", fees=" + fees + ", duration="
				+ duration + "]";
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(long courseId, String courseTitle, double fees, int duration) {
		super();
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.fees = fees;
		this.duration = duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
