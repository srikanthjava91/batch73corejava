package com.langfunda.methods;

class Student {
	int id;
	String name;
	double marks;
}

public class TypesOfMethodsDemo4 {

	// Factory method : A method which return Object is called
	Student getStudentInf() {
		Student st = new Student();
		st.id = 101;
		st.name = "Srikanth";
		st.marks = 65;
		return st;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		TypesOfMethodsDemo4 t = new TypesOfMethodsDemo4();

		Student s = t.getStudentInf();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.marks);
		System.out.println("main method ended !!");
	}

}
