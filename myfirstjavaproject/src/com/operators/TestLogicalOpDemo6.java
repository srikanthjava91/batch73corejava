package com.operators;

//5) Logical Operators
//&& || ! --> We need to use for Multiple conditions and will get boolean expression.
public class TestLogicalOpDemo6 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 20;
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false --> Dead code
		System.out.println(false && false);// false --> Dead code

		System.out.println(a < b && a != c && b == c);// true
		System.out.println(a < b && a == c);// false
		System.out.println(a > b && a != c);// false
		System.out.println(a > b && a == c);// false

		System.out.println(a > b && ++a > b);// false
		System.out.println(a);

		System.out.println("*************||***************");

		System.out.println(true || true);// true --> Dead code
		System.out.println(true || false);// true --> Dead code
		System.out.println(false || true);// true
		System.out.println(false || false);// false

		System.out.println("---------------------------");
		// 10 < 20 || 10!=20
		System.out.println(a < b || ++a != c);// true
		System.out.println(a);

		System.out.println(a < b || a == c);// true
		System.out.println(a > b || a != c);// true
		System.out.println(a > b || a == c);// false

		System.out.println("************* ! ***************");
		System.out.println(!true);

		System.out.println(!(a > b));
	}

}
