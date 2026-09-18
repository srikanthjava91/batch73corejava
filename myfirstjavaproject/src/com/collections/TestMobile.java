package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMobile {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("9R", "One Plus", 40000.00);
		Mobile m2 = new Mobile("S24", "Samsung", 75000.00);
		Mobile m3 = new Mobile("15", "IPhone", 80000.00);
		Mobile m4 = new Mobile("13 Pro", "Xiaomi", 35000.00);
		Mobile m5 = new Mobile("Edge 50", "Motorola", 45000.00);

		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		mobileList.add(m4);
		mobileList.add(m5);

		// Anonymous Inner class implements Comparator
		Comparator<Mobile> c = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
//				if (o1.price < o2.price) {
//					return -1;
//				} else if (o1.price > o2.price) {
//					return 1;
//				} else {
//					return 0;
//				}
				
				return o1.brand.compareTo(o2.brand);
			}

		};

		Collections.sort(mobileList, c);

		for (Mobile m : mobileList) {
			System.out.println(m);
		}
	}

}
