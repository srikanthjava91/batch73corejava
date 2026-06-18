package com.operators;

//WAP to find sum & avg of 10th class student marks !!
//input : 99 98 97 96 95 94 
public class Student {

	void main() {
		System.out.println("Welcome to Vcube !!");

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		double sum = 0;// 99 --> 197 --> 294 --> 390 -> 485 --> 579

		for (int m : marks) {
			sum += m;
		}
		double avg = sum / marks.length;

		System.out.println("Total marks : " + sum);
		System.out.println("Avg of all the marks : " + avg);

	}

}
