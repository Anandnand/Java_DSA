package com.kod.Arrayslevel1;

public class OnlyDistinctElements {
	public static void distinct(int arr[],int n) {
		for(int i=0;i<n;i++) {
			boolean isFound=true;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					isFound=false;
					break;
				}
			}
			if(isFound) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 1, 8, 2, 3};
		int n = arr.length;
		distinct(arr,n);
	}

}
