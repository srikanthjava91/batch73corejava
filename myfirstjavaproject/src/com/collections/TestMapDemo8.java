package com.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

//HashMap vs ConcurrentHashMap 
public class TestMapDemo8 {

	public static void main(String[] args) {

		Map<String, String> map = new ConcurrentHashMap<>();

		map.put("A", "Apple");
		map.put("B", "banana");
		map.put("C", "Cherry");
		map.put("D", "Dragon-Fruit");

		System.out.println(map);

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
			map.put("O", "Orange");
		}

	}

}
