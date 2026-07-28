package com.oops.inheritance;

import java.util.Scanner;

//Child or Sub or Derived class 
public class PersonalLoan extends Loan {
	static Scanner sc = new Scanner(System.in);
	
	@Override
	String hello() {
		return "Personl Loan";
	}

	void personalLonDocinfo() {
		System.out.println("Personal Loan documents have beeen received successfully !!");
	}
	
	

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Banking Loan !!");

//		Scenario 1: Child Object vs Child Reference 
//		By using Child Object and child reference we can call both 
//		Child class functionalities as well as Parent class functionalities.
		PersonalLoan pl = new PersonalLoan();

//		Scenario 2: Parent Object vs Parent Reference 
//		By using Parent Object and Parent reference we can call 
//		Only Parent class functionalities.
		Loan l1 = new Loan();

//		Scenario 3 : Child Object vs Parent Reference 
//		Q) Can we store Child Object into Parent Reference ..? Yes 
//		By using Child Object and Parent Reference we can 
//		Only Parent class functionalities but not child class functionalities 

//		What is UpCasting or What is Dynamic Method Dispatching ..? 
//		UPcasting means, Storing Child Object into Parent.
//		Dynamic Method Dispatching means, 
//		Generally, By using Child Object & Parent Reference we can only Parent class functionalities 
//		But, When we Override the method from Parent to Child even though it's point to Parent Reference 
//		the method is executing from child at Runtime is the process DMD.(Abstraction)
		Loan l2 = new PersonalLoan();
		System.out.println(l2.hello());

//		Scenario 4 
//		By using Child Object and Parent Reference 
//		what are the methods can we call ? 

//		Down-casting is not possible directly so we will get CE like below 
//		CE : Type mismatch: cannot convert from Loan to PersonalLoan
		
//		Note : If we Type Cast Explicitly 
//		What are the methods can we call ..? Firstly we will get Runtime Error 
//		which is ClassCastException : 
//		RE : java.lang.ClassCastException: class com.oops.inheritance.Loan 
//		cannot be cast to class com.oops.inheritance.PersonalLoan 
		PersonalLoan pl2 =(PersonalLoan) new Loan();
		pl2.personalLonDocinfo();
		pl2.cibilInfo();
		
		
		boolean isValidPhone = pl.isValidPhone();
		boolean isAadharValid = pl.isAadharValid();
		boolean isPanValid = pl.isPanValid();

		if (isValidPhone && isAadharValid && isPanValid) {
			String name = pl.getCustomerName();
			System.out.println("Wlecome to Vcube Banking Mr : " + name);
			double salary = pl.getCustomerSalaryInfo();
			double cibil = pl.cibilInfo();
			int age = pl.getCustomerAge();

			if (salary >= 800000.00 && (age >= 20 && age <= 60) && (cibil >= 300 && cibil <= 900)) {
				System.out.println("Congratualtions !! You are Eligible for Personal Loan !!");
				System.out.println("Your Rate of Interest is : " + pl.getROI());

			} else {
				System.out.println("Focus on your Career to get Loans !!");
			}
		} else {
			System.out.println("Invalid Details !");
		}

	}
}
