package com.arrays;

//WAP to find Total_Sum & avg of different subject from a Student.
// 65 66 67 62 53 60
public class TestArrayDemo5 {
	int[] marks = { 65, 66, 67, 62, 53, 60 };

	public static void main(String[] args) {

		TestArrayDemo5 t = new TestArrayDemo5();

		double total_Sum = 0;// 65+66=131+67 = 198+62=260+53= 313+60=373
		double avg = 0;

		for (int m : t.marks) {
			total_Sum += m;
		}

		avg = total_Sum / t.marks.length;

		System.out.println("Total Subject Marks : " + total_Sum);
		System.out.println("avg of all marks : " + avg);

	}

}
