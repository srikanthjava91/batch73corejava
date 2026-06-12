package com.langfunda.constructors;

public class Human {

	String name;
	String city;

	public Human() {
		System.out.println("Human class no arg constructor called ");

	}

	public Human(String name, String city) {
		System.out.println("Parameterized constructor called from Human");
		this.name = name;
		this.city = city;
	}

	public static void main(String[] args) {
		System.out.println("Human class main called ");

	}
}

class Person extends Human {

	Person(String name, String city) {
		super(name, city);
		System.out.println("parameterized constructor called From Person");
	}

	public static void main(String[] args) {
		System.out.println("Person class main method called ");

		Person p = new Person("Srikanth", "Hyderabad");
		System.out.println(p.name);
		System.out.println(p.city);
		
//		The constructor Person() is undefined
//		Person p1 = new Person();
		

	}
}
