package com.oops.inheritance;

import java.io.IOException;

class A {

	public static void main(String[] args) {
		System.out.println("main method from A ");
	}

	void show() throws Exception {

	}

}

class B extends A {
	public static void main(String[] args) {
		System.out.println("main method from B ");
	}

	void show() throws IOException {

	}

}

abstract class C extends B {

	@Override
	abstract void show();

}

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("TestDemo1 main method called !");
		B b = new B();
	}

}
