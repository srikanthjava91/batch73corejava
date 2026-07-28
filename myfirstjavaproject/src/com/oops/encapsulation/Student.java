package com.oops.encapsulation;

//POJO : Plain Old Java Object
//DTO : Data Transfer Object 
//Data Model 
public class Student  {

	// private Data
	private int sid;
	private String sname;
	private int age;

	// to String method
	@Override
	public String toString() {
		return "student Info : [ Student ID : " + sid + ", Student Name : " + sname + ", Student Age : " + age + "]";
	}

	// No arg constructor
	public Student() {
		System.out.println("no arg constructor called ");
	}

	//all arg constructor
	public Student(int sid, String sname, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}

	// public setters & Getters
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
