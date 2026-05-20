package com.javaintroduction;

//Ideally, static block executes first, in this program, 
//but before loading static block, JVM checks whether the main method is available or not,
//if main method is available then only static block executes first and then main method executes.
//By mistake if we removed main method we will get Runtime error like main method not found.

//Instance block will execute when we create object of a class.

//If we have static variable & static block, static variable executes first when it is in a order.
//The Execution is depending on Order.

public class TestDemo4 {

	static TestDemo4 t4 = new TestDemo4();

	static {
		System.out.println("static block loaded1 ");
	}

	static {
		System.out.println("static block loaded2 ");
	}

	static {
		System.out.println("static block loaded3 ");
	}

	{
		System.out.println("instance block loaded ");

	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDemo4 t4 = new TestDemo4();

	}

}
