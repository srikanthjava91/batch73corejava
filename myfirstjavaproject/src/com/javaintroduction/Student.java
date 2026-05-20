package com.javaintroduction;

public class Student {
	void display() {
		System.out.println("diplay method is ");
	}

	public static void main(String[] args) {
	

	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println(" finalize method called");
	}

}
