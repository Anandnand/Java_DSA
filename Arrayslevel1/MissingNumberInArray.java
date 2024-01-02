package com.kod.Arrayslevel1;

public class MissingNumberInArray {
	public static void missingNumber(int[] arr) {
		int n = arr.length+1;
		int sum =0;
		sum = n*(n+1)/2;
		System.err.println(sum);
	    int sumArr = 0;
		for(int i : arr) {
			sumArr+=i;
		}
		System.out.println("Missing number Is " + (sum-sumArr));
	}
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,6,7,8,9,10};
		missingNumber(arr);
		
	}

}
