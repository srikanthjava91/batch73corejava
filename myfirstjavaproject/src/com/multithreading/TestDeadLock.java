package com.multithreading;

class TestDeadLock {

	public static void main(String[] args) {

		String pen1 = "Pen-1";
		String pen2 = "Pen-2";

		Thread t1 = new Thread(() -> {

			synchronized (pen1) {

				System.out.println("Thread-1 locked Pen-1");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

				synchronized (pen2) {
					System.out.println("Thread-1 locked Pen-2");
				}
			}
		});

		Thread t2 = new Thread(() -> {

			synchronized (pen2) {

				System.out.println("Thread-2 locked Pen-2");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

				synchronized (pen1) {
					System.out.println("Thread-2 locked Pen-1");
				}
			}
		});

		t1.start();
		t2.start();
	}
}
