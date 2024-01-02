package com.kod.divideAndConquer;
import java.util.Scanner;

public class QuickSort {
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void quickSort(int arr[],int si,int ei) {
		
		// BASE CASE
		
		if(si>=ei) {
			return;
		}
	int pInx=partition(arr,si,ei);  //FINDING PIVOT INDEX MEANS LAST INDEX
	quickSort(arr,si,pInx-1);   // SORTING PIVOT LESSER VALUE
	quickSort(arr,pInx+1,ei);   //  SORTNG PIVOT GREATER VALUE
	}
	public static int partition(int arr[],int si,int ei) {
		int pivot=arr[ei];  ///LAST INDEX VALUE
		int i=si-1;
		
		//SWAPPING THE VALUES
		
		for(int j=si;j<ei;j++) {
			if(arr[j]<pivot) {
				i++;
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			}
		}
		i++;
		
		//SWAPPING PIVOT VALUE TO THE CORRECT PLACE
		
		int temp=pivot;
		arr[ei]=arr[i];
		arr[i]=temp;
		
	return i;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []arr= {2,1,9,8,6,5,4,3};
	quickSort(arr,0,arr.length-1);
   printArr(arr);
	}
 }

