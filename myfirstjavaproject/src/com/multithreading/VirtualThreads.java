package com.multithreading;

public class VirtualThreads {

	public static void main(String[] args) {
		System.out.println("main method started ");

		for (int i = 0; i < 1000; i++) {
			System.out.println("main : " + i);
		}

		for (int i = 1; i <= 10; i++) {
			Thread.startVirtualThread(() -> {
				System.out.println(Thread.currentThread());
			});
		}
	}
}
