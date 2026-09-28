package com.multithreading;

class BookMyShow1 {

	int tickets = 5;

	synchronized void bookTicket(String name, int requested) {

		System.out.println(name + " entered bookTicket()");

		if (tickets >= requested) {

			System.out.println(name + " is booking " + requested + " tickets");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			tickets = tickets - requested;

			System.out.println(name + " booking successful");
			System.out.println("Remaining tickets = " + tickets);

		} else {
			System.err.println(name + " → Tickets not available");
		}

		System.out.println(name + " exited bookTicket()");
	}
}

public class Test {

	public static void main(String[] args) {

		BookMyShow1 bms = new BookMyShow1();

		Thread t1 = new Thread(() -> {
			bms.bookTicket("Rahul", 3);
		});

		Thread t2 = new Thread(() -> {
			bms.bookTicket("Raj", 3);
		}

		);

		t1.start();
		t2.start();
	}
}
