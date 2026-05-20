package com.javaintro.garbage;

class Student {

	int sid;
	String sname;

}

//Driver class 
public class TestStudent {

	void main() {
		System.out.println("main method started ");

		Student s1 = new Student();
		System.out.println(s1);

		Student s2 = new Student();
		System.out.println(s2);

		Student s3 = new Student();// Object creation --> Heap memory
		System.out.println(s3);// Address of Object : Fully Qualified Name of the class & HexaDecimal Value of
								// the Hashcode
//		Fully Qualified Name of the class : package name + class name 
//		com.javaintro.garbage.Student

	}

}
