package com.collections;

import java.util.HashMap;
import java.util.Map;

//{33=Hardhik, 1=K L rahul, 18=Kohli, 3=Sooryvamsi, 7=Dhoni, 8=Jadeja, 45=Rohit}
public class TestMapDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(7, "Dhoni");
		map.put(18, "Kohli");
		map.put(45, "Rohit");
		map.put(33, "Hardhik");
		map.put(1, "K L rahul");
		map.put(8, "Jadeja");
		map.put(3, "Sooryvamsi");

		System.out.println(map.containsKey(7));
		System.out.println(map.get(45));
		System.out.println(map.containsValue("Jadeja"));
		System.out.println(map.remove(1));

		System.out.println(map);

	}
}
