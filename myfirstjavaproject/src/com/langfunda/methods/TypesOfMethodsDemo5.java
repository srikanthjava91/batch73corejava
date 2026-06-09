package com.langfunda.methods;

import java.util.Scanner;

//WAP to find Areas of Triangle, Square, Rectangle & Circle ..?
//Triangle --> 0.5 * base * height 
//Square --> side * side
//Rectangle --> Length * breadth 
//Circle --> PI * r * r 
public class TypesOfMethodsDemo5 {

	void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Base : ");
		float b = sc.nextFloat();

		System.out.println("Enter Height : ");
		double h = sc.nextDouble();

		double arTriangle = getAreaOfTriangle(b, h);
		System.out.println("Area Of Triangle : " + arTriangle);
		System.out.println("**********************************************");

		System.out.println("Enter a side");
		double side = sc.nextDouble();
		double arSquare = getAreaOfSquare(side);
		System.out.println("Area Of Square : " + arSquare);

		System.out.println("**********************************************");
		System.out.println("Enter a Radius ");
		double r = sc.nextDouble();
		double arSide = getAreaOfCircle(r);
		System.out.println("Area Of Circle : " + arSide);

		System.out.println("**********************************************");

		System.out.println("Enter Length : ");
		double length = sc.nextDouble();

		System.out.println("Enter breadth : ");
		double breadth = sc.nextDouble();

		double arRec = getAreaOfRectangle(length, breadth);
		System.out.println("Area of rectangle : " + arRec);

		System.out.println("main method ended ");

	}

	double getAreaOfTriangle(float base, double height) {
		double arTri = 0.5 * base * height;
		return arTri;
	}

	double getAreaOfSquare(double side) {
		return side * side;
	}

	double getAreaOfRectangle(double length, double breadth) {
		double arRec = length * breadth;
		return arRec;
	}

	double getAreaOfCircle(double radius) {
		double arCir = Math.PI * radius * radius;
		return arCir;
	}

}
