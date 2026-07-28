package com.oops.inheritance;

//Child or sub or Derived 
public class HomeLoan extends Loan {

	void homeLoanDocinfo() {
		System.out.println("Home Loan documents have beeen received successfully !!");
	}

//	Method Overriding Rule 
//	1) Method signature must be same.
//	Note : Method signature means method name + parameters but not return type.

//	2) Method return type must be same until 1.4 version.
//	Note : From 1.5 version Java Introduced co-varient return types.
//	Even though from 1.5 version, 
//		- If the Parent class method return type is Primitive data types, 
//	then the child class method return type must be same primitive data type.
//	 But, - If the Parent class method return type is Object data types, 
//	then the child class method return type can be same or co-varient return types.

//	What is co-varient return types..? 
//	If The Parent class method return type is Object type, 
//	then the child class method return type can be same object type or 
//	it's sub type is the process of co-varient return types.
	
//	ex: P --> Number --> C--> Number/Integer/Double/.......
//	ex: P --> String --> C --> String 
//	ex: P --> Object --> C --> Object / String any java object 

	@Override
	Double getROI() {
		double roi = 9.0;
		return roi;
	}

	public static void main(String[] pars) {
		System.out.println("Welcome to Vcube Home Loan Banking Loan !!");

		String s1 = new String();
		System.out.println(s1);

		HomeLoan pl = new HomeLoan();

		boolean isValidPhone = pl.isValidPhone();
		boolean isAadharValid = pl.isAadharValid();
		boolean isPanValid = pl.isPanValid();

		if (isValidPhone && isAadharValid && isPanValid) {
			String name = pl.getCustomerName();
			System.out.println("Wlecome to Vcube Home Loan Banking Mr : " + name);
			double salary = pl.getCustomerSalaryInfo();
			double cibil = pl.cibilInfo();
			int age = pl.getCustomerAge();

			if (salary >= 600000.00 && (age >= 20 && age <= 45) && (cibil >= 300 && cibil <= 900)) {
				System.out.println("Congratualtions !! You are Eligible for Home Loan !!");
				System.out.println("Your Rate of Interest is : " + pl.getROI());

			} else {
				System.out.println("Focus on your Career to get Loans !!");
			}
		} else {
			System.out.println("Invalid Details !");
		}

	}

}
