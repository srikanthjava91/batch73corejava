package com.multithreading;

public class VirtualThreadDemo {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Thread.startVirtualThread(() -> {
			System.out.println("Hello from " + Thread.currentThread());
		});
	}
}
