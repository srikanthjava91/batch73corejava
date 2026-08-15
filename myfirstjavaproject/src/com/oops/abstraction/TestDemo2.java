package com.oops.abstraction;

interface In4 {
	void method1();

	void method2();
	
	default void method5() {
		System.out.println("method5 called from In4 ");
	}
}

interface In5 {
	void method2();

	void method3();
	
	
	default void method5() {
		System.out.println("method5 called from In5 ");
	}
	
}

//Multiple Inheritance 
interface In6 extends In5, In4 {

	@Override
	default void method5() {
		// TODO Auto-generated method stub
		In5.super.method5();
	}

}

//Java Supports multiple inheritance for interfaces, 
//Because of unique implementation inside the classes even though we have same methods in two interfaces.  
class TestImpl1 implements In6 {

	@Override
	public void method1() {
		System.out.println("method1 called ");
	}

	@Override
	public void method2() {
		System.out.println("method2 called ");
	}

	@Override
	public void method3() {
		System.out.println("method3 called ");
	}

}

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		In6 t1 = new TestImpl1();
		t1.method1();
		t1.method2();
		t1.method3();
		t1.method5();

	}

}
