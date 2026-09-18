package com.collections;

import java.util.IdentityHashMap;
import java.util.Map;

//HashMap vs IdentityHashmap 
//String Literals 
//String Object
//When we work with HashMap internally it checks equals method then s1 and s2 both values are same.
//When we work with IdentityHashMap internally it checks == operator, SO s1 and s2 both values are not same when we use new String.
public class TestMapDemo5 {

	public static void main(String[] args) {

		Map<String, String> map = new IdentityHashMap<>();

//		String s1 = "Java";//1001
//		String s2 = "Java";//1001

		String s1 = new String("Java");// 1001
		String s2 = new String("Java");// 1002

		map.put(s1, "is Tough");
		map.put(s2, "is simple");

		System.out.println(map.get(s2));
		System.out.println(map);

	}

}
