package com.oops.inheritance.copy;

public class TestDemo2 {

	public static void main(String[] args) {

		Student s1 = new Student(102, "Ram", new Address("Banglore"));
		System.out.println(s1.toString());
		System.out.println(s1.getClass());
	}
}
