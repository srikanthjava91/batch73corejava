package com.java8features.streams;

import java.util.Arrays;
import java.util.List;

class Employee {
	int sid;
	String name;
	double salary;

	public Employee(int sid, String name, double salary) {
		this.sid = sid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [sid=" + sid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}

public class TestStreamDemo10 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(101, "Srikanth", 50000.00), 
				new Employee(101, "Sudheer", 70000.00),
				new Employee(101, "Siddik", 80000.00));
		
		employees.stream()
				 .filter(emp -> emp.salary > 50000.00)
				 .forEach(System.out::println);

	}

}
