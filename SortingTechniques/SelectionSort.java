package com.kod.SortingTechniques;


import java.util.Scanner;

public class SelectionSort {
	public static void sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {	
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
				arr[i]=arr[pos];
				arr[pos]=temp;
		}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		 int arr[]=new int[sc.nextInt()];
		 
		 System.out.println("enter the array contents");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("array  before sorting");
		 for (int x : arr) {
			 System.out.print(x+" ");
		}
		 System.out.println();
		 
		 sort(arr);
		 System.out.println("array after sorting");
		 for (int x : arr) {
			 System.out.print(x+" ");
		}
		 
	}

}
