package com.multithreading;

class Test1 {

}

public class MyThread2 extends Thread {

	public static void main(String[] args) {
		System.out.println("main method started ");

		
		Thread.currentThread().setName("Sri1");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());

//		MyThread2 m = new MyThread2();
		MyThread2 t = new MyThread2();
		t.start();
//		t.start();
//		t.setName("Sri");

		for (int i = 0; i <= 10; i++) {
			System.out.println("main ");
		}
		System.out.println("main method ended ");

	}

//	@Override
//	public void start() {
//		System.out.println("Start method called ");
//	}

	@Override
	public void run() {
		System.out.println("run method started ");
		Thread.currentThread().setName("Sri2");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("run ");
		}
		System.out.println("run method ended ");

	}

}
