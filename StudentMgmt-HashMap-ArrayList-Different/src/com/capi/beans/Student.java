package com.capi.beans;

public class Student {
	
	private int rollno;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, String courseName, int age, String mobileNo) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.courseName = courseName;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	private String name;
	private String courseName;
	private int age;
	private String mobileNo;
	

}
