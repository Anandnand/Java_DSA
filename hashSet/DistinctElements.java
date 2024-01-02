package com.kod.hashSet;

import java.util.HashSet;

public class DistinctElements {
	public static void main(String[] args) {
	    int ele[]= {1,9,5,7,8,4,3,2,5,9,2,1};
		HashSet<Integer> hs= new HashSet<>();
		for(int i=0;i<ele.length;i++) {
			hs.add(ele[i]);	
		}
		System.out.println("The distinct elements size is "+hs.size());
		System.out.println("The distinct elements size is"+hs);
	}

}
