package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueDemo1 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

//		IllegalStateException - if the element cannot be added at this time 
//		due to capacity restrictions
		q.add(10);
		q.add(15);
		q.add(12);
		q.add(11);
		q.add(9);
		q.add(5);
		q.add(8);

		System.out.println(q);
		
//		Retrieves, but does not remove,
//		the head of this queue, or returns null if this queue is empty.
		System.out.println(q.element());
		
		
//		Retrieves and removes the head of this queue. 
//		This method differs from poll() only in that it throws an exception if this queue is empty.
		System.out.println(q.remove());//NoSuchElementException

		System.out.println(q);

	}

}
