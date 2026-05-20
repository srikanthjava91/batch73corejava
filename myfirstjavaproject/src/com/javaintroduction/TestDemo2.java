package com.javaintroduction;

public class TestDemo2 {

	static String org_name = "Vcube";

	public static void main(String[] args) {
		System.out.println("main method strated ");

		System.out.println("main method ended ");
	}

	static {
		System.out.println("static block loaded " + org_name);
	}
}
