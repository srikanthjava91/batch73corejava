package com.oops.inheritance.copy;

class Employee {

	int eid;
	String ename;
	Address1 address1;

	public Employee(int eid, String ename, Address1 address1) {
		this.eid = eid;
		this.ename = ename;
		this.address1 = address1;
	}

	Employee(Employee emp) {
		this.eid = emp.eid;
		this.ename = emp.ename;
		this.address1 = new Address1(emp.address1);
	}
}

class Address1 {
	String city;

	public Address1(String city) {
		this.city = city;
	}

	Address1(Address1 add) {
		this.city = add.city;
	}

}

public class TestDeepCopyDemo1 {

	public static void main(String[] args) {

		System.out.println("main method staretd ");

		Address1 ad = new Address1("Chennai");

		Employee emp1 = new Employee(1, "Rahul", ad);
		System.out.println(emp1.eid);
		System.out.println(emp1.ename);
		System.out.println(emp1.address1.city);
		System.out.println("----------------------------");

		Employee emp2 = new Employee(emp1);
		System.out.println(emp2.eid);
		System.out.println(emp2.ename);
		System.out.println(emp2.address1.city);
		System.out.println("----------------------------");

		emp2.address1.city = "Banglore";
		System.out.println(emp2.address1.city);
		System.out.println("----------------------------");
		System.out.println(emp1.address1.city);

	}

}
