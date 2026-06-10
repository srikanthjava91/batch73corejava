package com.langfunda.constructors;

public class Employee {

	int eid;
	String ename;
	double salary;

	Employee() {
		System.out.println("no arg constructor called ");
		eid = 100;
		ename = "unknown";
		salary = 1000.00;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Employee e1 = new Employee();
		e1.show();

		Employee e2 = new Employee();
		e2.show();

		Employee e3 = new Employee();
		e3.show();

		System.out.println("main method ended ");
	}

	void show() {
		System.out.println("******************");
		System.out.println("Employee ID : " + eid);
		System.out.println("EMployee Nam e: " + ename);
		System.out.println("Emploayee Salary : " + salary);

	}

}
