package com.langfunda;//2

//6 12 8 7 9 6 7 8 6 7 8 8 8 7 8 6 9 6 7 10 7 7 6 8 13 14 
public class TestIdentifiers_Demo1 {// 3

	int student_id = 10;// 4
	double price$ = 50000.00;// 5
	String name = "Vcube";// 6 7

//			int println = 25;
//			String System = "hello";
//			double out = 242587568;

	void hello() {// 8
		System.out.println("hello method called ");// 9 10 11
	}

	public static void main(String[] args) { // 12 13
		System.out.println("main method started ");

		TestIdentifiers_Demo1 t1 = new TestIdentifiers_Demo1();// 14

		System.out.println(t1.student_id);
		System.out.println(t1.price$);
		System.out.println(t1.name);
		t1.hello();

		System.out.println("main method ended ");

	}

}
