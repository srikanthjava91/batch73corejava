package com.java8features.predefinedfuninterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class TestFunctionDemo2 {

	public static void main(String[] args) {

		Predicate<Student> p1 = (st) -> st.marks > 80;

		Function<Student, String> f1 = (st) -> {
			String grade = "";

			if (st.marks >= 90) {
				grade = "A";
			} else if (st.marks >= 80) {
				grade = "B";
			} else if (st.marks >= 70) {
				grade = "C";
			} else if (st.marks >= 60) {
				grade = "D";
			} else if (st.marks >= 35) {
				grade = "P";
			} else {
				grade = "F";
			}

			return grade;

		};

		Consumer<Student> c1 = (s) -> {
			System.out.println("Name of th Student : " + s.name);
			System.out.println("Marksof the Student : " + s.marks);
			System.out.println("Grade of the Student  " + f1.apply(s));
			System.out.println("-----------");
		};

		Student[] students = { new Student("Gill", 98), new Student("Rohit", 87), new Student("Kohli", 77),
				new Student("Ruthuraj", 67)

		};

		for (Student s : students) {
			if (p1.test(s)) {
				c1.accept(s);
			}
		}
	}
}
