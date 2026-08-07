package com.oops.polymorphism;

//byte short int long float double 
//char boolean 
public class TestPolyDemo2 {

	void main(String[] args) {
		System.out.println("main method strated ");

		addition();
		addition((byte)10);
		
//		The method addition(float, int) is ambiguous for the type TestPolyDemo2
//		addition(10, 50);
	}
	
//	void addition(int i, int j){
//		System.out.println("addition int i and j called ");
//	}
	
	void addition(float i, int j){
		System.out.println("addition float i and float j called ");
	}
	
//	void addition(float i, float j){
//		System.out.println("addition float i and float j called ");
//	}
	
	void addition(int i, float j){
		System.out.println("addition int i and float j called ");
	}
	
	void addition(byte b) {
		System.out.println("addition byte called ");
	}

	void addition() {
		System.out.println("addition no arg called ");
	}

//	void addition(int i){
//		System.out.println("addition int arg called ");
//	}

//	void addition(float i) {
//		System.out.println("addition float arg called ");
//	}

//	void addition(double i) {
//		System.out.println("addition double arg called ");
//	}

}
