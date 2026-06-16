package com.operators;

public class TestAssignmentOpDemo2 {

	public static void main(String[] args) {

		int result = 5;

		System.out.println(result);

//		Explicit Type casting 
//		result = (int) (result + 4.5);// Type mismatch: cannot convert from double to int
		result += 4.5;// result = result + 4.5;//Narrowing //9

//		result = result -2.5;
		result -= 2.5;// result = result -2.5 --> 6

//		result = result * 3.5;
		result *= 3.5;// result = result *3.5 --> 21

//		result = result/4.5; --> 4.5)21(4
//									18 
//									-----
//									3
		result /= 4.5;// --> 4

//		result = result %1.5;
		result %= 1.5;

		System.out.println(result);// 1

	}
}
