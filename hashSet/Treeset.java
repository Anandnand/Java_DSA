//Ascending order output
//null values are  not allowed
//O(logn) time complexity

package com.kod.hashSet;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
	TreeSet<Integer> ts = new TreeSet<>();
	ts.add(10);
	ts.add(6);
	ts.add(1);
	ts.add(9);
	ts.add(2);
	ts.add(3);
	System.out.println(ts);

    //contains

	System.out.println(ts.contains(3));
	System.out.println(ts.contains(10));

	// remove

	System.out.println(ts.remove(6));
	System.out.println(ts);

	//size
	System.out.println(ts.size());

	//clear
	
	ts.clear();
	System.out.println(ts);
	
	System.out.println(ts.isEmpty());

	}
}
