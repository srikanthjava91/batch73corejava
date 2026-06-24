package com.langfunda.methods;

//WAP to find sum & avg of the 10th class student marks ..? 
//99 98 97 96 95 94 
public class Student1 {

	void main() {
		System.out.println("10th clas Student marks info !");

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		double sum = 0;//99 -> 197 -> 294 -> 390 + 485 + 579
		double avg = 0;
		
		for(int m:marks) {
			sum = sum + m;
		}
		
		avg = sum/marks.length;
		
		System.out.println("Total marks " + sum );
		System.out.println("AVg od all the marks : " + avg);

	}
}
