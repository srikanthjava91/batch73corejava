package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is executing task");
	}
}

public class ExecutorDemo {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);

//Executes the given command at some time in the future. 
//The command may execute in a new thread, in a pooled thread, or in the calling thread, at the discretion of the Executor implementation.
		for (int i = 1; i <= 10; i++) {
			service.execute(new MyTask());
		}
		service.shutdown();
	}
}
