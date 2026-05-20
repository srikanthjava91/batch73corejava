package com.javaintroduction;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method strated !");

		Class c = Class.forName("com.javaintroduction.Cricketer");
		System.out.println(c);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("main method ended !");

	}
}
