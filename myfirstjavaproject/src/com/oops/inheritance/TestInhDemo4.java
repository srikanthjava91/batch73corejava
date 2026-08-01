package com.oops.inheritance;

class TestA1 {

	TestA1() {
		System.out.println("Hello TestA1 cons...");
	}

}

class T1 {
	T1() {
		System.out.println("Hello T1 cons...");
	}
}

class TestB1 extends TestA1 {
	TestB1() {

		System.out.println("Hello TestB1 cons...");
	}
}

///Syntax error on token ",", . expected
///Multiple Inheritance is not possible 
//class TestC1 extends TestA1, TestB1{
//	
//}

public class TestInhDemo4 {

	public static void main(String[] args) {

		System.out.println("main method strated ");

		TestB1 t = new TestB1();

		System.out.println("main method ended ");

	}

}
