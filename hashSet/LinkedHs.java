package com.kod.hashSet;
import java.util.LinkedHashSet;


//inserted order output
//null values are allowed
//O(1) time complexity

public class LinkedHs {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(4);
		lhs.add(7);
		lhs.add(10);
		lhs.add(6);
		lhs.add(8);
		System.out.println(lhs);

		System.out.println(lhs);

        //contains

		System.out.println(lhs.contains(3));
		System.out.println(lhs.contains(10));

		// remove

		System.out.println(lhs.remove(6));
		System.out.println(lhs);

		//size
		System.out.println(lhs.size());

		//clear
		
		lhs.clear();
		System.out.println(lhs);
		
		System.out.println(lhs.isEmpty());


	}
}
