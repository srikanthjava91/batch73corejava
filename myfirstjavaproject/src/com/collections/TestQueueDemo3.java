package com.collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueDemo3 {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		q.offer(1);
		q.offer(3);
		q.offer(2);
		q.offer(4);
		System.out.println(q);
	}
}
