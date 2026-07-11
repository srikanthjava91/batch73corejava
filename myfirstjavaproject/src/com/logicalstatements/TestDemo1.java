package com.logicalstatements;

//WAP to find sum & avg of 10th class student marks..? 
//99 98 97 96 95 94 
public class TestDemo1 {

	void main() {
		System.out.println("main method started ");

		int[] marks = { 99, 98, 97, 96, 95, 94 };
		
		double sum = 0;
		double avg = 0;
		
		for(int m:marks) {
			sum = sum + m;
		}
		
		avg = sum/marks.length;
		
		System.out.println("total marks : " + sum );
		System.out.println("avg of all marks  " + avg );

	}

}
