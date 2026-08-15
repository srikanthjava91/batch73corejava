package com.exceptionhandling;

public class TestExDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
//		Integer i = 10;
//		System.out.println(i/null);//The operator / is undefined for the argument type(s) Integer, null

		int[] arr = new int[5];// 0 1 2 3 4

		try {
			arr[0] = 22;
			arr[1] = 23;
			arr[2] = 21;
			arr[3] = 24;
			arr[4] = 25;
			arr[5] = 22;
//			No exception of type Object can be thrown; 
//			an exception type must be a subclass of Throwable
		} catch (NullPointerException e) {
			System.err.println("IN NPE");
		}

		catch (Exception e) {
			System.err.println("IN Ex");
		}

//		Unreachable catch block for ArrayIndexOutOfBoundsException. 
//		It is already handled by the catch block for Exception
//		catch (ArrayIndexOutOfBoundsException e) {
		////			Index 5 out of bounds for length 5
//			System.err.println("IN AIOE");
//		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("main method ended ");
	}

}
