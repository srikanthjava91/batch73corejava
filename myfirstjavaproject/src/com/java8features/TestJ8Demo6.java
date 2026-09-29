package com.java8features;

@FunctionalInterface
interface In6 {
	String welcome(String fname, String lname);
}

public class TestJ8Demo6 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		In6 t6 = (f, l) -> f + l;
		System.out.println("Welcome mr/mrs : " + t6.welcome("Virat", "Kohli"));
		System.out.println("main method ended !!");
	}
}
