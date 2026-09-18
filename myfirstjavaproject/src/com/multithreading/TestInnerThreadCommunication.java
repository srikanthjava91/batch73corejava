package com.multithreading;

class Resource {

	int i = 0;
	boolean status = false;

	synchronized void put(int i) throws InterruptedException {
		while (status) {
			wait();
		}

		this.i = i;
		System.out.println("PUT : " + i);
		status = true;
		notify();
	}

	synchronized void get() throws InterruptedException {
		while (!status) {
			wait();
		}
		System.out.println("GET : " + i);
		status = false;
		notify();
	}

}

class Producer implements Runnable {

	Resource r;

	Producer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 1;
		while (true) {

			try {
				r.put(i++);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class Consumer implements Runnable {
	Resource r;

	Consumer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			try {
				r.get();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class TestInnerThreadCommunication {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Resource r = new Resource();
		Producer p1 = new Producer(r);
		Consumer c1 = new Consumer(r);

		System.out.println("main method ended ");

	}

}
