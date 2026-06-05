package com.langfunda.methods;

// methods with no arguments + with return return type.
public class EmployeeSalaryInfo {

	void main() {
		System.out.println("main method started ");

		double total_sal = getSalaryInfo();
		double bon = getBonus();

		System.out.println("Total Salary is : " + (total_sal + bon));

		System.out.println("main method ended ");
	}

	double getBonus() {
		double bonus = 15000.00;
		return bonus;
	}

	double getSalaryInfo() {
		double totalSalary = 0;

		double sal = 100000.00;
		double hra = 35000.00;

		totalSalary = sal + hra;

		return totalSalary;

	}

}
