package com.javaintroduction;

//in static --> static (Y)
//in static --> instance(N): we must need to create object

//in instance --> instance (Y)
//in instance --> static (Y)

//Whenever the behavior is same for all the objects then we can choose methods as static.
//Whenever the behavior is not same or specific to the objects we can choose those methods as instance.

//ex: Student 
//	behaviors : static : read() write() listen() 
//				instance: singing() dance() playCricket()

//static methods, we can call without creating object directly or by using class name.
//instance methods, we must need to call by using object reference variable.

public class TestDemo7 {

	static void show() {
		TestDemo7 t = new TestDemo7();// Object creation
		t.hello();
		System.out.println("show method called ");
	}

	// instance method
	void hello() {
		disply();
		System.out.println("hello method called ");
	}

	// JVM will call the main method
	public static void main(String[] args) {
		System.out.println("main method strated ");
		System.out.println(Thread.currentThread());
		TestDemo7.show();// calling the static method directly or by using class name
		System.out.println("main method ended ");
	}

	static void welcome() {
		System.out.println("welcome method called ");
	}

	void disply() {
		welcome();
		System.out.println("disply method called ");
	}

	static {
		System.out.println("Good Morning !!");
	}
}
