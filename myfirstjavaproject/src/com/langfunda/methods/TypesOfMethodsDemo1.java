package com.langfunda.methods;

//i) methods with no arguments + no return type (static & instance)
public class TypesOfMethodsDemo1 {

	void hello() {
		System.out.println("Hello guys, Good morning !");
	}

	public static void welcome() {
		System.out.println("Welcome to methods");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		TypesOfMethodsDemo1 t1 = new TypesOfMethodsDemo1();
		welcome();
		t1.hello();

		System.out.println("main method ended ");
	}
}
