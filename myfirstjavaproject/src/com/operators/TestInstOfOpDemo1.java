package com.operators;

//instanceof is for checking the Reference variable whether 
//the reference is from Specified Object or not .? 
public class TestInstOfOpDemo1 {

	public static void main(String[] args) {

		Integer i = 10;

		System.out.println(i instanceof Integer);
		System.out.println(i instanceof Number);
		System.out.println(i instanceof Object);
		System.out.println(null instanceof Integer);//false
		
		String s = "Sriaknth";
		System.out.println(s instanceof String);//true
		System.out.println(s instanceof Object);//true
		//Incompatible conditional operand types String and Integer
//		System.out.println(s instanceof Integer);//CE 

	}

}
