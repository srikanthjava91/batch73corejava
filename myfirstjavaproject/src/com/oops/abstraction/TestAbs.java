package com.oops.abstraction;

public abstract class TestAbs implements Interf1 {
	
	abstract void methodx();

//	instance variable 
	int a = 101;
	String name = "Srikanth";

//	static variable 
	static String orgName = "Vcube";

//	Constructor 
	TestAbs() {
		System.out.println("no arg constructor called ");
	}

//	concrete methods or instance 
//	we can call by using child class object references.
	void hello() {
		System.out.println("hello method called ");
	}

//	Default methods are allowed only in interfaces.
//	default void hi() {
//		
//	}

//	static methods 
	static void welcome() {
		System.out.println("Welcome method called ");
	}

//	override methods from interface 
	@Override
	public void method1() {
		System.out.println("method1 called from TestAbs");
	}

	@Override
	public void method2() {
		System.out.println("method2 called from TestAbs");
	}

	@Override
	public void method3() {
		System.out.println("method3 called from TestAbs");
	}

	@Override
	public void method4() {
		System.out.println("method4 called from TestAbs");

	}

	@Override
	public void method5() {
		System.out.println("method5 called from TestAbs");
	}

}
