package com.kod.SortingTechniques;


import java.util.Scanner;

public class InsertionSort {
	public static void sort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
		int item=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int arr[]= {5,8,4,7,9,3,2,1};
		sort(arr);
		 System.out.println("The sorted array is");
		 for (int x :  arr) {
				System.out.print(x+" ");
			}

		 
	}     
	
}
