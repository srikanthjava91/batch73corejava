package com.oops.inheritance;

//Note : Every class extends Object class, so we can consider this as 
// Implicit Single Inheritance.
class TestA {
	int a = 10;

	void method1() {
		System.out.println("method1 called from TestA ");
	}
}

//
//A class extends a class will consider as 
//Single Inheritance 
class TestB extends TestA {
	int b = 20;

	void method2() {
		System.out.println("method2 called from TestB");
	}
}

//Multi-Level Inheritance 
class TestC extends TestB {
	int c = 30;

	void method3() {
		System.out.println("method3 called TestC");
	}
}

public class TestInhDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		TestA a = new TestA();
//		System.out.println(a.hashCode());

		TestC c = new TestC();

		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);

		c.method1();
		c.method2();
		c.method3();

		System.out.println(c.hashCode());
	}
}
