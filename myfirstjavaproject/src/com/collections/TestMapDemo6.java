package com.collections;

import java.util.Map;
import java.util.WeakHashMap;

class Student {

	@Override
	public String toString() {
		return "student";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}

}

//HashMap vs WeakHashMap 
//HashMap is dominating Garbage Collector.
//Whereas Garbage Collector dominates WeakHashMap because its Weak.
public class TestMapDemo6 {

	public static void main(String[] args) throws InterruptedException {
		Map<Object, String> map = new WeakHashMap<>();

		Student s = new Student();
		map.put(s, "Srikanth");
		System.out.println(map);

		s = null;
		System.gc();

		Thread.sleep(2000);
		System.out.println(map);
	}
}
