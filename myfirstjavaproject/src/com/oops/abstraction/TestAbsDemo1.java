package com.oops.abstraction;

public class TestAbsDemo1 {

	public static void main(String[] args) {

//		Cannot instantiate the type TestAbs, Because TestAbs is abstract
//		TestAbs ta = new TestAbs(); 

		TestAbs t = new TestA();
		t.method1();
		t.method2();
		t.hello();

		System.out.println("-------------------------");

		TestB t1 = new TestB();
		t1.method4();
		t1.method5();

		System.out.println("-------------------------");
		TestC t2 = new TestC();
		t2.method3();

	}

}
