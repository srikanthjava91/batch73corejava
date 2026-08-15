package com.oops.abstraction;

public class TestA extends TestAbs {

	TestA() {
		super();
		System.out.println("constructor called from TestA ");
	}

	@Override
	public void method1() {
		System.out.println("method1 called from TestA");
	}

	@Override
	public void method2() {
		System.out.println("method2 called from TestA");

	}

	@Override
	void methodx() {
		// TODO Auto-generated method stub
		
	}

}
