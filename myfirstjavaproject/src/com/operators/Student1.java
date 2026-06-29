package com.operators;

//WAP to find Total_marks & avg of 10th student marks ..? 
public class Student1 extends Object {

	@Override
	protected void finalize() {
		System.out.println("finalize method called ");
	}

	void main() {
		System.out.println("main method started");

		Student1 s1 = new Student1();
		
		s1=null;
		System.gc();

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		Object[] obj = { "srikanth", 100, 58.5 };

		double total_marks = 0;// 99+98 = 197+97= 294+96 = 390+95=485+94 = 579
		double avg = 0;

		for (int m : marks) {
			total_marks = total_marks + m;
		}

		avg = total_marks / marks.length;

		System.out.println("Total Marks of 10th class student : " + total_marks);
		System.out.println("AVg of studnet marks: " + avg);

		byte b = 10;// byte --> int --> implict type casting
		System.out.println(b);// type casting
		System.out.println(100);// int
		System.out.println(10.5);// double
		System.out.println(9972677655L);// long
		System.out.println(s1);// object

	}
}
