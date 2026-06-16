package com.operators;

//4) Comparison Operators 

//== != < <= > >= 
//Comparison Operator will give you the resulted values like boolean expressions. 
//like either true or false
//== Operator always checks Values if the data is Primitive.
//If the data is from Objects it checks addresses of the object.
//.equals method from String class checks content of the Objects.

//byte short int long float double char boolean 
public class TestComparisonOpDemo6 {

	public static void main(String[] args) {
		
		//-2147483648
		int a1 = 2147483647;
		System.out.println(a1++);
		System.out.println(a1);

		int x = 5;
		int y = 6;
		int z = 5;
		System.out.println(x != y);// true
		System.out.println(x > y);// false
		System.out.println(x < y);// true
		System.out.println(x <= z);// true
		System.out.println(x >= z);// true

		System.out.println("-----------------------");
		int a = 10;
		int b = 10;
		int c = 20;

		char c1 = 'A';
		char c2 = 'A';

		System.out.println(a == b);// true
		System.out.println(a == c);// false
		System.out.println(c1 == c2);// true
		System.out.println("************************");
//		== operator checks addresses of the Objects but not values 
//		where String is a Pre-defined class or Object in java.

		String s1 = "Srikanth";// String Literals are stored SCP
		String s2 = new String("Srikanth");// String Object Stored in Heap Area
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);// false

		System.out.println(s1.equals(s2));// password checking in Real-time
		System.out.println(s1.equalsIgnoreCase(s2));// username checking in Real time

	}

}
