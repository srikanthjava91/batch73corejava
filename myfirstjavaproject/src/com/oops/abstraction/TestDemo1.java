package com.oops.abstraction;

interface In1 {

	void method1();

	void method2();

	void method3();
}

abstract class TesA implements In1 {
	public void method1() {

	}
}

class B extends TesA {

	public void method2() {
	}

	public void method3() {
	}
}

public class TestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
