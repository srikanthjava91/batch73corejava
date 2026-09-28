package com.multithreading;

class BookMyShow {
	int total_tickets = 10;

	synchronized void bookMyTickets(String name, int tickets) {

		if (tickets <= total_tickets) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			total_tickets = total_tickets - tickets;

			System.out.println("Your Tickets has been booked Successfully Mr/Ms " + name);
			System.out.println("Your Total Booked Tickets are : " + tickets);
			System.out.println("Available Tickets from Book My SHow is : " + total_tickets);
		} else {
			System.err.println("Tickets have been sold out : ");
			System.err.println("Available tickets are : " + total_tickets);
		}

	}

}

class Customer extends Thread {
	BookMyShow bms;
	String customerName;
	int tikets;

	public Customer(BookMyShow bms, String customerName, int tikets) {
		super();
		this.bms = bms;
		this.customerName = customerName;
		this.tikets = tikets;
	}

	@Override
	public void run() {
		bms.bookMyTickets(customerName, tikets);
	}

}

public class TestBookMyShowDemo {

	public static void main(String[] args) {

		BookMyShow bms = new BookMyShow();

		Customer venkat = new Customer(bms, "venkat Reddy ", 6);
		venkat.start();

		Customer ravi = new Customer(bms, "Ravi Teja ", 6);
		ravi.start();

		Customer siddik = new Customer(bms, "Siddik ", 8);
		siddik.start();
		
		Customer sri = new Customer(bms, "Srikanth ", 4);
		sri.start();
	}

}
