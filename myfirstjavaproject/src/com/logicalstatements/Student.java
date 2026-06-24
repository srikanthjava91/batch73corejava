package com.logicalstatements;

//Q) WAP to find total_marks & avg of all the marks for 10th class student.
//99 98 97 96 95 94 
public class Student {

	void main() {
		System.out.println("Welcome to Vcube !");
		int[] marks = { 99, 98, 97, 96, 95, 94 };//o(n)

		double total_marks = 0;// 99 -> 197 -> 294 ->390 --> 485 -> 579
		double avg = 0;

		// for each loop
		for (int m : marks) {
			total_marks = total_marks + m;
		}
		
		avg = total_marks/marks.length;

		System.out.println("Total marks : " + total_marks);
		System.out.println("avg of all the marks :  " + avg);

	}

}
