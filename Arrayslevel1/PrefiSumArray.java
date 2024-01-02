package com.kod.Arrayslevel1;

public class PrefiSumArray {
	public static void prefixSum(int arr[], int prefixSum[],int n) {
		prefixSum[0]=arr[0];

		for (int i = 1; i < n; i++) {
            prefixSum[i]=prefixSum[i-1]+arr[i];    
		}
		
	}

	public static void main(String[] args) {
		int arr[] = { 20, 39, 48, 5, 4 };
		int n = arr.length;
		int prefixSum[]=new int[n];
		prefixSum(arr,prefixSum,n);
		for(int i=0;i<n;i++) {
			System.out.println(prefixSum[i]);
		}
		

	}

}
