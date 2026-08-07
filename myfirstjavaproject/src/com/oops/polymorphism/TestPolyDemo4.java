package com.oops.polymorphism;


//Method Overloading is not dependent on Return types.
//It is Depending on only 

//Parameter count should be different 
//Parameter order should be different 
//Parameter Type should be different 

//Note : 
public class TestPolyDemo4 {

	void main(String[] args) {
		System.out.println("main method started ");
		method1();

		System.out.println("main method ended ");
	}

//	void method1(){
//		System.out.println("method called with void ");
//	}

	int method1(){
		System.out.println("method1 called with int ");
		return 10;
	}

}
