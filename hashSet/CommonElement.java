package com.kod.hashSet;
import java.util.*;

public class CommonElement {
	public static void main(String[] args) {
	int[]arr = { 2, 3, 4, 5, 6, 7, 8 };
    int[]arr1 = { 5, 6, 7, 8, 9, 10 };

	 HashSet<Integer>h1=new HashSet<>();
	 for(int i=0;i<arr.length;i++) {
		 h1.add(arr[i]);
	 }
	  System.out.println(h1);
	 
	  System.out.println("the array common elements are ");
	for(int i=0; i< arr1.length; i++) {
		if(h1.contains(arr1[i])) {
			System.out.print(arr1[i]+" ");
		}
		
	}
	 
	 
	}
}
