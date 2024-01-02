package com.kod.Arrayslevel1;
import java.util.Arrays;

public class SecondSmallestElement {
	public static void secondsmallest(int arr[], int n) {
		Arrays.sort(arr);
		for (int i = 1; i<n-1; i++) {
			int low = arr[0];
			if (arr[i] != low) {
				System.out.println("the second smallest element is " + arr[i]);
				return;
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 6, 7, 8, 3, 8, 2, 1, 1 };
		int n = arr.length;
		secondsmallest(arr, n);

	}

}
