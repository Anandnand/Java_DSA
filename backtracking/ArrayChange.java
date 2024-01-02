//import java.util.Scanner;
//
//public class inArray {
//	public static void inArray(int arr[],int i,int val) {
//	if(i==arr.length) {
//		printArr(arr);
//		return;
//	}
//	
//	arr[i]=val;
//	inArray(arr,i+1,val+1);
//    arr[i]=arr[i]-2;
//}
//	public static void printArr(int arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int []arr=new int[6];
//		inArray(arr,0,1);
//		printArr(arr);
//		
//	}
//
//}
package com.kod.backtracking;

import java.util.Scanner;

public class ArrayChange {
	public static void inArray(int arr[],int i,int val) {
	if(i==arr.length) {
		printArr(arr);
		return;
	}
	//INITIALIZE
	
	arr[i]=val;
	
	//INCREMENT
	
	inArray(arr,i+1,val+1);
	
	//BACKTRACKING
	
    arr[i]=arr[i]+2;
}
	
	
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[6];
		inArray(arr,0,5);
		printArr(arr);
		
	}

}
