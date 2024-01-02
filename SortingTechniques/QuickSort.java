package com.kod.SortingTechniques;


import java.util.Scanner;

public class QuickSort {
	public static void printArr(int arr[]) {
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
    }
    System.out.println();
}
	
	public static void quickSort(int arr[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		
	int pInx=partition(arr,si,ei);
	quickSort(arr,si,pInx-1);
	quickSort(arr,pInx+1,ei);
	}

	public static int partition(int arr[],int si,int ei) {
		int pivot=arr[ei];
		int i=si-1;
		
		for(int j=si;j<ei;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		i++;
		int temp=pivot;
		arr[ei]=arr[i];
		arr[i]=temp;
		
		return i;			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {3,6,8,2,1,5,6};
		quickSort(arr,0,arr.length-1);
		printArr(arr);
		}
	}


