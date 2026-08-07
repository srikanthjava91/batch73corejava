package com.oops.abstraction;

public class Monkey implements Animal {
	
	@Override
	public void hello(){
		System.out.println("hiiiiiiiiiiiiii");
		System.out.println("hiiiiiiiiiiiiii");
		System.out.println("hiiiiiiiiiiiiii");
		System.out.println("hiiiiiiiiiiiiii");
	}
	
	
	static void breath() {
		System.out.println("Every animal should breath to survive !!");
	}

	// Yes we can override default methods in classes with out default keyword.
	// By mistake if use default in classes we will get below error : Default
	// methods are allowed only in interfaces.
	@Override
	public void walk() {
		System.out.println("Monkey can walk and also can Jump !!");
	}

	@Override
	public void eat() {
		System.out.println("Monkey can eat banana's ");
	}

	@Override
	public void sleep() {
		System.out.println("Monkey's life style almost like human's ");
	}

	@Override
	public void sound() {
		System.out.println("khchhhhhhhhhh kchhhhhhhhhh");
	}

}
