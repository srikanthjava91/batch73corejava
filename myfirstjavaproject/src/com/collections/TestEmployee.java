package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp1 = new Employee(18, "Virat", 18000.00, 37);
		Employee emp2 = new Employee(45, "Rohit", 45000.00, 38);
		Employee emp3 = new Employee(7, "Dhoni", 770000.00, 42);
		Employee emp4 = new Employee(1, "K L rahul", 110000.00, 35);
		Employee emp5 = new Employee(33, "Hardhik", 330000.00, 36);

		List<Employee> empList = new ArrayList<>();

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		for (Employee emp : empList) {
			System.out.println(emp);
		}

//		System.out.println(empList);

	}

}
