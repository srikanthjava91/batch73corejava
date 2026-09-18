package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapDemo2 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("TG", "Telangana");
		map.put("AP", "Andhrapradesh");
		map.put("KA", "Karnataka");
		map.put("TN", "Tamil Nadu");
		map.put("KL", "Kerala");
		map.put("MH", "Maharashtra");
		map.put("GJ", "Gujarat");
		map.put("RJ", "Rajasthan");

		System.out.println(map.containsKey("MH"));
		System.out.println(map.get("KL"));
		System.out.println(map.containsValue("Kerala"));
		System.out.println(map.keySet());// Set
		System.out.println(map.values());// Collection

		Set<Entry<String, String>> mapElements = map.entrySet();
		for (Entry<String, String> element : mapElements) {
			System.out.println(element.getKey() + " : " + element.getValue());
		}

//		System.out.println(map);

	}

}
