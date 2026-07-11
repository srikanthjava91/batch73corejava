package com.logicalstatements;

public class TestLSDemo14 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i < 5) {
				continue;
			}

			System.out.println("hello : " + i);

		}
	}
}
