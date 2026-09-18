package com.collections;

import java.util.LinkedList;
import java.util.Queue;

//A collection designed for holding elements prior to processing.
public class TestQueueDemo2 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

//		true if the element was added to this queue, else false
		q.offer(null);// false
		q.offer(15);// false
		q.offer(12);
		q.offer(10);
		q.offer(9);
		q.offer(22);
		q.offer(15);
		q.offer(16);
		q.offer(null);

		System.out.println(q.peek());// null
		System.out.println(q.poll());// null

		System.out.println(q);
	}

}
