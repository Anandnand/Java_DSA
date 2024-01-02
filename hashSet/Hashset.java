package com.kod.hashSet;

import java.util.HashSet;


//unorder output
//null values are allowed
//O(1) time complexity
public class Hashset {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(6);
		hs.add(1);
		hs.add(9);
		hs.add(2);
		hs.add(3);
		System.out.println(hs);

        //contains

		System.out.println(hs.contains(3));
		System.out.println(hs.contains(10));

		// remove

		System.out.println(hs.remove(6));
		System.out.println(hs);

		//size
		System.out.println(hs.size());

		//clear
		
		hs.clear();
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());


	}

}
