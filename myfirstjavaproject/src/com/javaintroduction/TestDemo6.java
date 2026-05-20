package com.javaintroduction;

public class TestDemo6 {

//	 We cannot call, instance methods directly in static area.
//	 if we want to call instance methods, we must need to create an object.
	static void method1() {
		System.out.println("method1 is called ");
		TestDemo6 t = new TestDemo6();
		t.method2();
	}

//	In instance, can we call static methods ..? 
//	Yes we can call directly or by using class name.
//	In instance, can we call instance methods ..? 
//	Yes we can call instance methods in instance methods directly.
	void method2() {
		System.out.println("method2 is called ");
		method3();
		method4();
	}

	static void method3() {
		System.out.println("method3 is called ");
	}

	void method4() {
		System.out.println("method4 is called ");
	}

//	method signature should not be same in a single class.
//	signature + method name + arguments 
//	static void method4() {
//		System.out.println("method4 is called ");
//	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		method1();
	}

}
