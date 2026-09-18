package com.collections;

import java.util.Stack;

//Stack --> LIFO : Last In First Out 
public class TestStackDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Stack<String> s = new Stack<>();

		s.push("J2SE");
		s.push("J2EE");
		s.push("J2ME");
		s.push("Spring");
		s.push("Spring Boot");
		s.push("Micro services");
		s.push("Servlet");
		s.push("React");
		s.push("Angular");

		System.out.println(s.empty());
		System.out.println(s.remove(s.indexOf("J2ME")));
//		Removes the object at the top of this stack and returns that object as the value of this function.
		s.pop();//
//		Looks at the object at the top of this stack without removing it from the stack
		System.out.println(s.peek());// React
		System.out.println(s);

//		Returns the 1-based position where an object is on this stack.
		System.out.println(s.search("Spring Boot"));

	}

}
