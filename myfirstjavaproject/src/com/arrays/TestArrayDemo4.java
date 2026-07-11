package com.arrays;

//Errors will come due to lack of resources like 
//	- StackOverFlowError 
//  - OutOfMemoryError

//When we use Negative values for array size , we will get 
//	java.lang.NegativeArraySizeException

//Q) Declare, Create & Initialize Array in a Single line ..? 
//Q) WAP to Print Array in Reverse Order ..? 
//Q) What will be the max Size can we give for an Array ..? 2^31= 2147483647
//If we give more than that will get a CE : The literal 2147483648 of type int is out of range 
public class TestArrayDemo4 {

	public static void main(String[] args) {

		System.out.println("main method started");
//		int[] arr = new int[2147483647];//

		int[] arr = {};
		System.out.println(arr);//// Address of the Object: [I@2b2fa4f7

		int[] arr1 = { 10 };
		System.out.println(arr1);//// Address of the Object: [I@1dbd16a6

		System.out.println("*********Array Reverse Started **********************************");

		int[] numbers = { 10, 20, 30, 40, 50, 60 };// 0 1 2 3 4 5
		System.out.println(numbers.length);

		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println("main method ended");

	}

}
