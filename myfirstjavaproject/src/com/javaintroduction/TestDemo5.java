package com.javaintroduction;

public class TestDemo5 {

	// instance method
	void hello() {
		System.out.println("Hello guys, Good morning !");
		System.out.println("Hello guys, Good morning !");
		System.out.println("Hello guys, Good morning !");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		System.out.println(Thread.currentThread());

//		calling the static methods directly or by using class name
		TestDemo5.welcome();

//		If we want to call instance methods, we must need to create an Object 
		TestDemo5 t1 = new TestDemo5();
		t1.hello();

		System.out.println("main method ended !");

	}

	// static methods
	public static void welcome() {
		System.out.println("Welcome to java World !");
		System.out.println("Welcome to java World !");
		System.out.println("Welcome to java World !");
		System.out.println("Welcome to java World !");

	}

}
