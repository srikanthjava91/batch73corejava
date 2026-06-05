package com.langfunda.methods;

public class StudentInfo {

	void main() {
		System.out.println("Student details !");
		getStudentName("Srikanth");// Call by value (Parameter)
		getAge(23);
		feeInfo(25000.00);
		heightAndWeightInfo(5.9F, 75.0);
		heightAndWeightInfo(5, 80);

	}

	// method with arguments
	void getStudentName(String name) {
		System.out.println("Student Name is : " + name);
	}

	void getAge(int age) {
		System.out.println("Student Age is : " + age);
	}

	void feeInfo(double fee) {
		System.out.println("Student Fee is : " + fee);
	}

	void heightAndWeightInfo(float h, double w) {
		System.out.println("Student height is : " + h);
		System.out.println("Student Weight is : " + w);
	}
}
