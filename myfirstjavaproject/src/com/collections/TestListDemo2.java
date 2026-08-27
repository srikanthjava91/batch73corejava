package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo2 {

	public static void main(String[] args) {

		List<String> teamA = new ArrayList<>();
		teamA.add("Kohli");
		teamA.add("Dhoni");
		teamA.add("Srikanth");
		teamA.add("Soorya");
		teamA.add("Vishwanath");

		List<String> teamB = new ArrayList<>();
		teamB.add("Gill");
		teamB.add("Krunal");
		teamB.add("Hardhik");
		teamB.add("Rohit");
		teamB.add("Sanju");

		List<String> teamC = new ArrayList<>();

		teamC.add("Abhishek");
		teamC.add("Ishan");
		teamC.add("Gaikwad");

		List<String> teamD = new ArrayList<>();

		teamD.addAll(teamA);
		teamD.addAll(teamB);
		teamD.addAll(1, teamC);

		System.out.println(teamD);

		for (int i = 0; i < teamD.size(); i++) {
			System.out.println(teamD.get(i));
		}

		
		System.out.println(teamD.indexOf("Srikanth"));
		System.out.println(teamD.lastIndexOf("Srikanth"));
		System.out.println("***************************");
		
		teamD.remove("Srikanth");
		System.out.println("***************************");
		System.out.println(teamD);

		List<Integer> l1 = new ArrayList<>();

		// 400 100 200 300 400 400

		l1.add(400);
		l1.add(1, 100);
		l1.add(2, 200);
		l1.add(400);
		l1.add(3, 300);
		l1.add(4, 400);
		System.out.println(l1);

	}

}
