package com.multithreading;

public class Test2 {

	public static void main(String[] args) {

		BookMyShow2 bms = new BookMyShow2();

		Thread t1 = new Thread(() -> {
			bms.bookTicket("Rahul", 3);
		});

		Thread t2 = new Thread(() -> {
			bms.bookTicket("Raj", 3);
		});

		t1.start();
		t2.start();
	}
}

class BookMyShow2 {

	int tickets = 5;

	void bookTicket(String name, int requested) {

		System.out.println(name + " started searching...");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " found the movie");

		synchronized (this) {

			System.out.println(name + " entered critical section");

			if (tickets >= requested) {

				System.out.println(name + " is booking " + requested);

				tickets = tickets - requested;

				System.out.println(name + " booking successful");

			} else {

				System.err.println(name + " → Tickets not available");
			}
		}

		System.out.println(name + " completed booking process");
	}
}
