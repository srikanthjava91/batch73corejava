package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//WAP to print Occurrences of the each character..? 
//Input is : Java 
//output is : J = 1, a =2, v = 1 
public class TestMapDemo4 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();// {}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String : ");// Javaaa
		String str = sc.next();

		char[] ch = str.toCharArray();// String to Character Arrays

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);

	}
}
