package com.collections;

public class TestListDemo6 {

	void main(String[] args) {
		System.out.println("main method started ");
		addition();
		addition(10);
		addition(10, 20);
		addition(10, 20, 30);
		addition(10, 20, 30, 40);
		addition(10, 20, 30, 40, 50);
		addition(10, 20, 30, 40, 50, 60);
		addition(10, 20, 30, 40, 50, 60, 70);

	}

	// The variable argument type int of the method addition must be the last
	// parameter
	void addition(int... numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum = sum + n;
		}
		System.out.println(sum);
	}

}
