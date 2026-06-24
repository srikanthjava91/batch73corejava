package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo10 {

	String getStudentMarkP(int marks) {

		String grade = switch (marks / 10) {
		case 9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		case 5, 4 -> "Just Passed";
		default -> "F";
		};

		return grade;

	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();

		String grade = getStudentMarkP(marks);
		System.out.println("Based on Studnet marks the Grade is : " + grade);

		sc.close();

	}
}
