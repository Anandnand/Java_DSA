package com.kod.Arrayslevel1;
import java.util.Arrays;

public class MoveAllZeroToEnd {
	public static void moveZeroEnd(int arr[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < n) {
			arr[count++] = 0;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 6, 0, 0, 3, 8, 2, 1, 0 };
		int n = arr.length;
		moveZeroEnd(arr, n);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
