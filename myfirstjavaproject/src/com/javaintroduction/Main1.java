package com.javaintroduction;

public class Main1 {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		s.display();
		s = null;

		System.gc();// nullfying reference

		s = new Student();
		System.out.println(s);
		//s = null;
		Student s1=s;
		System.gc();//
		

	}

}
