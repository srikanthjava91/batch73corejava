package com.oops.encapsulation;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.setAge(23);
		s1.setSid(101);
		s1.setSname("Ram");
		System.out.println(s1.toString());// Address of the Object

		Student s2 = new Student(102, "Virat", 25);
		System.out.println(s2);

	}

}
