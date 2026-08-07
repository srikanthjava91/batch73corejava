package com.oops.polymorphism;

import java.util.Scanner;

//WAP to print Areas of Square, Rectangle, Triangle, Circle

//Areas of Square : side  * side 
//Area of Rectangle : length * Breadth 
//Area of Triangle  : 0.5 * base * height 
//Area of Circle : PI * r * r
public class TestPolyDemo5 {

	void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter a side : ");
		
		double side = sc.nextDouble();
		double areaOfsq = findArea(side);
		System.out.println("Area of Square : " + areaOfsq);

		System.out.println("main method ended ");
	}

	double findArea(double side) {
		return side * side;
	}

	double findArea(double length, double breadth) {
		return length * breadth;
	}

	double findArea(float base, double height) {
		return 0.5 * base * height;
	}

	double findArea(float radius) {
		return Math.PI * radius * radius;
	}

}
