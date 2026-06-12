package com.langfunda;

//WAP to find sum & avg 10th student class marks .. ?
//99 98 97 96 95 94 
public class Student1 {

	void main() {

		System.out.println("student marks list ");

		int[] marks = { 99, 98, 97, 96, 95, 94 };
		
		double sum = 0;
		double avg = 0;
		
		for(int m:marks) {
			sum  += m;
		}
		
		avg = sum/marks.length;
		
		System.out.println("Total marks : " + sum );
		System.out.println("avg of akll marks : " + avg);
		
		

	}

}
