package com.multithreading;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("run method started ");
		for (int i = 0; i <= 100; i++) {
			System.out.println("run ");
		}
		System.out.println("run method ended ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		MyThread1 m = new MyThread1();
		m.start();

		for (int i = 0; i <= 100; i++) {
			System.out.println("main ");
		}

		System.out.println("main method ended ");
	}
}
