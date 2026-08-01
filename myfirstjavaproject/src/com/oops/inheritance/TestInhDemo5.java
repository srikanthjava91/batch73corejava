package com.oops.inheritance;

interface In1 {
	public abstract void method5();
}

interface In2 {
	public abstract void method6();
}

//A class can have Multiple Children's 
//Two class can extends one class will consider as Hierarchical Inheritance.
//Cycle detected: the type TestA2 cannot extend/implement itself or one of its own member types
class TestA2 {
	void method1() {
		System.out.println("method1 called ");
	}
}

class TestB2 extends TestA2 {
	void method2() {
		System.out.println("method1 called ");
	}
}

class TestC2 implements In1, In2 {
	void method3() {
		System.out.println("method1 called ");
	}

	@Override
	public void method5() {
		System.out.println("method5 called ");
	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub

	}
}

public class TestInhDemo5 {

	public static void main(String[] args) {
		TestC2 t = new TestC2();
		System.out.println("main method started " + t.getClass());

//		TestC2 t = new TestC2();
//		t.method1();

		TestB2 t1 = new TestB2();
		t1.method1();

	}

}
