package com.collections;

import java.util.Hashtable;
import java.util.Map;

//HashMap vs Hashtable 
//HashMap can allow both kay and value as null but key on once but values can be any number times.
//Hashtable cannot allow null keys and values.
//If we try to access we will get RE : NullPointerException 
//And HashMap is Not-Synchronized where as Hashtable is legacy and it is Synchronized.

public class TestMapDemo7 {

	public static void main(String[] args) {

		Map<String, Float> map = new Hashtable<>();
		map.put("Prabhas", 6.3F);
		map.put("Jr NTR", 5.9F);
		map.put("Ram Charan", 6.0F);
		map.put("Mahesh Babu", 6.1F);
//		map.put(null, 6.1F);
//		map.put(null, 6.2F);
		map.put("Ram", null);
//		map.put("Sri", null);

		System.out.println(map);

	}

}
