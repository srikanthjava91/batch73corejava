package com.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyOnWriteArrayListDemo {

	public static void main(String[] args) {

		List<Integer> al = new CopyOnWriteArrayList<>();

		al.add(100);
		al.add(150);
		al.add(200);
		al.add(250);
		al.add(300);
		al.add(350);

//		for (Integer a : al) {
//			System.out.println(a);
//			al.add(400);
//		}

//		for(int i=0;i<=al.size();i++) {
//			System.out.println(al.get(i));
		////			al.add(400);
//		}

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			al.add(400);
//			al.remove(al.indexOf(300));
		}

		System.out.println(al);

	}

}
