package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestSetDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Set<Integer> s = new LinkedHashSet<>();

		s.add(4);
		s.add(18);
		s.add(17);
		s.add(16);
		s.add(32);
		
		s.add(34);
		s.add(38);
		s.add(48);
		s.add(52);
		s.add(64);
		
		s.add(62);
		s.add(37);
		s.add(40);
		s.add(45);
		s.add(14);
		
		System.out.println(s);
	}
}
