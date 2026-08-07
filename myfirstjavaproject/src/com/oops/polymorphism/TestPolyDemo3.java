package com.oops.polymorphism;

public class TestPolyDemo3 {

	void main() {
		System.out.println("main method staretd  ");

		String s = "Srikanth";
		getName(s);

		String s2 = new String("Srikanth");
		getName(s2);

//		getName(null);

		System.out.println("main method ended  ");
	}

	void getName(Integer i) {
		System.out.println("Integer method called ");
	}

	void getName(String str) {
		System.out.println("String method called ");
		System.out.println(str);
	}

	void getName(Object obj) {
		System.out.println("Object method called ");
		System.out.println(obj);
	}

}
