package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestSetDemo1 {

	public static void main(String[] args) {

//		Map<Integer, String> m = new HashMap<>();
//		m.put(7, "Dhoni");
//		m.put(18, "Virat");
//		m.put(45, "Rohit");
//		m.put(33, "Pandya");
//		m.put(35, "Pandya");
//		System.out.println(m);

//		Constructs a new, empty set; 
//		the backing HashMap instance has default initial capacity (16) and load factor (0.75).
		Set<Integer> s = new HashSet<>();

//		s.add("A");
		s.add(18);// 2 --> 18%16 = 2 --> map.put(18, new Object())
		s.add(45);// 13 --> 45%16 = 13
		s.add(34);// 2 --> 34%16 = 2
		s.add(9);// 9 --> 9 %16 = 9
		s.add(2);// 2 --> 2% 16 = 2
		s.add(68);// 4 ---> 68 % 16 = 4
		s.add(38);// 6 ---> 38 %16 = 6
		s.add(16);// 0 ---> 16%16 = 0
		s.add(32);// 0 --> 32%16 = 0
		s.add(32);// 0 --> 32%16 = 0
		s.add(32);// 0 --> 32%16 = 0
		s.add(null);// 0 --> 32%16 = 0
		s.add(null);// 0 --> 32%16 = 0
		s.add(null);// 0 --> 32%16 = 0

		System.out.println(s);// 16 32 18 34 2 68 38 9 45

	}
}
