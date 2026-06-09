package com.langfunda.constructors;

//IMP interview Question ..? 
//Already Java Compiler providing default constructor Then why we need no arg constructor ..?

//Ans1 : While Creating an Object if we want to Load user defined data manually, 
//Instead of JVM Given values.

//Ans2 : 

//Q) Already we have a instance block, then why we need constructor..? 
//ans: 
public class Student {

	int id;
	String name;

	Student() {
		System.out.println("No arg constructor called ");
		id = 101;
		name = "Unknown";
	}

//	// instance block 
//	{
//		System.out.println("instance block loaded ");
//		id = 101;
//		name = "Unknown";
//	}

	public static void main(String[] args) {
		System.out.println("main method strated !");

//		Note 1 : The below Object is created with the help of "default constructor "
//		Note 2: The below Object is created with the help of "no arg constructor"
//		Note 3 : Whenever the class contains any other constructor, 
//		Then Java Compiler will not create default constructor.

//		LHS = Class name with Object Reference variable.
//		RHS = Constructor calling with the help of new keyword will consider as Object.
		Student s1 = new Student();// Object Creation

		System.out.println(s1.id);
		System.out.println(s1.name);

	}
}
