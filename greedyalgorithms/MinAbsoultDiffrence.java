package com.kod.greedyalgorithms;
import java.util.*;

public class MinAbsoultDiffrence {
	public static void main(String[] args) {
		int arrA[]= {4,7,8,1,3};
		int arrB[]= {5,2,7,9,4};
		
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		int minAbsdiff=0;
		for(int i=0;i<arrA.length;i++){
			minAbsdiff +=Math.abs(arrA[i]-arrB[i]);	
		}
		System.out.println("Minimum absolute difference is ="+minAbsdiff);
	}

}