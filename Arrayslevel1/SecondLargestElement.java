package com.kod.Arrayslevel1;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargestElement {
	public static void secondLargset(int arr[],int n) {
	Arrays.sort(arr);
	for(int i=n-2;i>0;i--) {
		int high=arr[n-1];
		if(arr[i]!=high) {
			System.out.println("the second largest element is "+arr[i]);
			return;
		}
	}
	
	}
	public static void main(String[] args) {
		int arr[]= {6,7,8,3,8,5,6,1};
		int n=arr.length;
		secondLargset(arr,n);
	
	}

}
