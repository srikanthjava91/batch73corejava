package com.langfunda;

import java.math.BigDecimal;
import java.math.BigInteger;

class Dog {

}

public class TestDataTypesDemo2 {

//	Note : Auto Boxing & Unboxing came from Java 1.5 version, Before that we were doing the conversion like below.
//		- 	Integer.vlaueof() : Auto-Boxing 
//	    - 	Integer.xxxvalue()  : Auto-Unboxing
//	Converting Primitive data types to Wrapper Object data types will consider as Auto Boxing.

//	ex: int to Integer 
	Integer i = 100;

//	Before 1.5 version
	Integer x = Integer.valueOf(100);

//	Converting Wrapper Object Data Type to Primitive Data Type will consider as Auto-Unboxing.
	int i1 = i;

//	Before 1.5 version
	int i2 = x.intValue();

	Character c = 'A';

	String s = "Srikanth";

	BigInteger bi1 = new BigInteger("765463576758764356");
	BigInteger bi2 = new BigInteger("765463576758764356");

	BigDecimal bd1 = new BigDecimal("7564646464645676576567.098674643365476");
	BigDecimal bd2 = new BigDecimal(7564646464645676576567.098674643365476);
//	Dog d = "Puppy";

	public static void main(String[] args) {
		System.out.println("main method strated ");

//		Wrapper Caching : If the range is -128 to 127 
//		its creating only one object for all the data 
		Integer i1 = 100;
		Integer i2 = 100;

//		== operator always checks the value if the data is Primitive.
//		== operator always checks Object references if the data is Object types.

		System.out.println(i1 == i2);// true

		Integer i3 = 200;
		Integer i4 = 200;
		System.out.println(i3 == i4);// false

		TestDataTypesDemo2 t = new TestDataTypesDemo2();
		System.out.println(t.i);// 0 null
		System.out.println(t.c);// null

		System.out.println(t.s);// null
		System.out.println(t.bi1);// null

		// The operator + is undefined for the argument type(s)
//		java.math.BigInteger, java.math.BigInteger
//		System.out.println(t.bi1+t.bi2);

		System.out.println(t.bi1.add(t.bi2));
		System.out.println(t.bi1.multiply(t.bi2));

		System.out.println(t.bd1.add(t.bd2));
		System.out.println(t.bd1.multiply(t.bd2));

//		System.out.println(t.bd);//0 null 
//		System.out.println(t.d);//null 

	}

}
