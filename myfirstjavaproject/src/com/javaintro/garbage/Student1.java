package com.javaintro.garbage;

//WAP to find toatl_marks & avg of 10th class student marks ..? 
//99 98 97 96 95 94 
public class Student1 {

	void main() {
		System.out.println("main method started ");

		int[] marks = { 99, 98, 97, 96, 95, 94 };
		
		double total_marks = 0;//99+98=197+97=294+96=390+95=485+94=579
		double avg = 0;
		
		for(int m :marks) {
			total_marks = total_marks+ m;
		}
		avg = total_marks/marks.length;
		
		System.out.println("Sum of all the elements : " + total_marks);
		System.out.println("avg of all marsk : " + avg);
		
	}

}
