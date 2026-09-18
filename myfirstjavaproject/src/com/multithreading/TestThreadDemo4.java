package com.multithreading;

public class TestThreadDemo4 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started ");

		TestThreadDemo4 t4 = new TestThreadDemo4();
		t4.start();
		t4.interrupt();//Interrupts this thread.
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended ");
	}

	@Override
	public void run() {
		System.out.println("run method started ");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.err.println("Yes !! Iam Intrrupted ");
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println("run : " + i);
		}

		System.out.println("run method ended ");
	}

}
