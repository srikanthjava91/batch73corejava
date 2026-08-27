package com.collections;

public class Employee {

	int eid;
	String ename;
	double esal;
	int age;

	@Override
	public String toString() {
		return "EMployee Info [ Employee ID : " + eid 
							+ ", Employee Name : " + ename
							+", Employee Salary : " + esal 
							+ ", Employee Age : " + age ;
	}

	public Employee(int eid, String ename, double esal, int age) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.age = age;
	}

}
