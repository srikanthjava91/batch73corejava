package com.multithreading;

public class MyThread4 extends Thread {
	public static void main(String[] args) {

		MyThread4 m = new MyThread4();
		m.start();
//		m.interrupt();//Interrupts this thread.
		for (int i = 0; i < 10000; i++) {
			System.out.println("main Thread " + i);
		}

	}

	@Override
	public void run() {
		System.out.println("I am entering into sleep state");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			System.err.println("I got Interrupted");
//		}
		
		Thread.yield();

		for (int i = 0; i < 10000; i++) {
			System.out.println("I am lazy Thread " + i);
		}
	}
}
