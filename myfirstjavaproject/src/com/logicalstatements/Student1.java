package com.logicalstatements;

//WAP to find TotalMarks & avg of 10h class Student ..?
//input : 99 98 97 96 95 94
//output : tm, avg 
public class Student1 {

	void main() {
		System.out.println("main method started ");

		int[] marks = { 99, 98, 97, 96, 95, 94 };
		
		double total_marks = 0;
		double avg = 0;
		
		for(int m:marks) {
			total_marks = total_marks + m;
		}
		
		avg = total_marks/marks.length;
		
		System.out.println("Total marks of the Student : " + total_marks);
		System.out.println("Avg of Marks : " + avg);
		

	}
}
