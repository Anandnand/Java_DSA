package com.kod.SortingTechniques;


import java.util.Scanner;

//public class BubbleSort {
//	public static void sortArr(int arr[]) {
//		for(int i=0;i<=arr.length-2;i++) {
//			for(int j=0;j<=arr.length-2-i;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the array length");
//		int arr[]=new int[sc.nextInt()];
//		
//		System.out.println("Enter the array elements");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("the array contents are");
//		for (int i : arr) {
//			
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//        System.out.println("the sorted array in ascending order");
//		System.out.println("the sorted array is");
//		sortArr(arr);
//		for (int x : arr) {
//			System.out.print(x+" ");
//		}
//		}
//
//		
//	}

public class BubbleSort {
	public static void sortArr(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[]=new int[sc.nextInt()];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the array contents are");
		for (int i : arr) {
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("the sorted array in discending order");
		sortArr(arr);
		for (int x : arr) {
			System.out.print(x+" ");
		}
		}

		
	}



