package com.collections;

import java.util.HashSet;
import java.util.Objects;

class Employee2 {

	int id;
	String name;

	Employee2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Employee2 e = (Employee2) obj;
		return id == e.id && name.equals(e.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}

public class TestSetDemo6 {

	public static void main(String[] args) {

		Employee2 e1 = new Employee2(101, "Rahul");
		Employee2 e2 = new Employee2(101, "Rahul");

		HashSet<Employee2> s = new HashSet<>();

		s.add(e1);
		s.add(e2);

		System.out.println(s);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
