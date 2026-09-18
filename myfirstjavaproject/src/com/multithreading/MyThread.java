package com.multithreading;

public class MyThread extends Thread {

//	Whenever the child is not happy with the Parent class functionalities 
//	then go and create the same method with same signature 
//	in the child class with the different behavior is the concept called Overriding.
	@Override
	public void run() {
		System.out.println("run method started ");
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println("run " + i);
		}

		System.out.println("run method ended ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(Thread.currentThread());

		MyThread m = new MyThread();
//		Causes this thread to begin execution
//		JVM calls run method of this Thread 
		m.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main " + i);
		}

		System.out.println("main method ended ");
	}

}
