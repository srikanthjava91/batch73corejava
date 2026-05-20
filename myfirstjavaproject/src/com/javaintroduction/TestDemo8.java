package com.javaintroduction;

public class TestDemo8 {
	
	//Native methods do not specify a body
//	native static void welcome();
	
	static void hello() {
		int a = 10;
		int b = 20;
		String name = "Srikanth";
		
		System.out.println(a+b);
		
		System.out.println("hello ");
		System.out.println(a);
		System.out.println(name);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		hello();
		hello();
		hello();
		hello();
		hello();
		hello();
//		welcome();
	}

}
