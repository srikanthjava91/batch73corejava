package com.exceptionhandling;

public class TestExDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("in try 1");
			System.out.println(10 / 2);
			try {
				System.out.println("in try2");
				System.out.println(10 / 0);
			} catch (Exception e) {
				System.out.println("in catch 2");
				try {
					System.out.println("in try3");
					System.out.println(10 / 0);
				} catch (Exception e1) {
					System.out.println("in catch3");
					System.out.println(e1.getMessage());
				}
			}finally {
				System.out.println("in finally2 ");
			}
		} catch (Exception e) {
			System.out.println("in catch 1");
			try {
				System.out.println("in try4");
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.out.println("in catch4");
				System.out.println(e1.getMessage());
			}

		} finally {
			System.out.println("in finally !!");
			try {
				System.out.println("in try5");
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.out.println("in catch5");
				System.out.println(e1.getMessage());
				System.out.println(10 / 0);
			}
		}

		System.out.println("main method ended ");
	}

}
