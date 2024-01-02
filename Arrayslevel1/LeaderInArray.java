package com.kod.Arrayslevel1;

public class LeaderInArray {
	public static void leader(int arr[], int n) {
		for (int i = 0; i < n - 1; i++) {
			boolean isFound = true;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[i]) {
					isFound = false;
					break;
				}
			}
			if (isFound) {
				System.out.print(arr[i]+" ");
			}
			
		}
		System.out.println(arr[n - 1]);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 7, 8, 2, 3 };
		int n = arr.length;
		leader(arr, n);
		

	}
}
