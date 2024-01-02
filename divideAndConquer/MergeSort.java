package com.kod.divideAndConquer;
import java.util.Scanner;

public class MergeSort {
	
	//PRINT ARRAY
	
     public static void printArr(int arr[]) {
	  for(int i=arr.length-1;i>=0;i--) {
		  System.out.print(arr[i]+" ");
	  }
	  System.out.println();
  }
	 
	  public static void mergeSort(int arr[],int si,int ei) {
		 
		  //BASE CASE
		  
		  if(si>=ei) {
			 return;
		 }
	
		  //WORK
		  
		  int mid=si+(ei-si)/2;
		  mergeSort(arr,si,mid);    //LEFT part
		  mergeSort(arr,mid+1,ei);  //RIGHT part
		  merge(arr,si,mid,ei);
	  }
	  
		//SORTING IN TEMPORARY ARRAY
	  
	  public static void merge(int arr[],int si,int mid,int ei) {
		  int temp[]=new int[ei-si+1];
		  int i=si;
		  int j=mid+1;
		  int k=0;
		  
		  while(i<=mid && j<=ei) {
			  if(arr[i]<=arr[j]) {
			  temp[k]=arr[i];
			  i++;
		     }else{
			  temp[k]=arr[j];
			  j++;
		  }
		  k++;
		}
		  
		  // REMAINING ELEMENTS OF LEFT PART
		  
		  while(i<=mid) {
			  temp[k++]=arr[i++];  
		  }
		  
		  //REMAINING ELEMENTS OF RIGHT PART
		  
		  while(j<=ei) {
			  temp[k++]=arr[j++];
		  }
	  
		  //COPY  TEMP ARRAY TO THE ORIGINAL ARRAY
		  
		  for(k=0,i=si;k<temp.length;k++,i++) {
			  arr[i]=temp[k];
		  }  
  }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      	int []arr= {6,3,9,5,8,2,1,4};
      	mergeSort(arr,0,arr.length-1);
      	printArr(arr);
	
	}
}


//public class MergeSort {
//      public static void printArr(int arr[]) {
//	  for(int i=0;i<arr.length;i++) {
//		  System.out.print(arr[i]+" ");
//	  }
//	  System.out.println();
//  }
//	 
//	  public static void mergeSort(int arr[],int si,int ei) {	  
//		  if(si>=ei) {
//			 return;
//		  }
//		  int mid=(si+ei)/2;
//		  mergeSort(arr,si,mid);   
//		  mergeSort(arr,mid+1,ei);  
//		  merge(arr,si,mid,ei);
//	  }
//	  public static void merge(int arr[],int si,int mid,int ei) {
//		  int temp[]=new int[ei-si+1];
//		  int i=si;
//		  int j=mid+1;
//		  int k=0;
//		  
//		  while(i<=mid && j<=ei) {
//			  if(arr[i]<=arr[j]) {
//			  temp[k]=arr[i];
//			  i++;
//		     }else{
//			  temp[k]=arr[j];
//			  j++;
//		  }
//		  k++;
//		} 
//		  
//		  while(i<=mid) {
//			  temp[k++]=arr[i++];  
//		  }
//		  while(j<=ei) {
//			  temp[k++]=arr[j++];
//		  }	  
//		  
//		  for(k=0,i=si;k<temp.length;k++,i++) {
//			  arr[i]=temp[k];
//		  }  
//  }
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//      	int []arr= {9,7,8,3,2,5,6,1,0};
//      	mergeSort(arr,0,arr.length-1);
//      	printArr(arr);
//	
//	}
//}
//
////INBUILT SORTING IN ARRAYS
//import java.util.Arrays;
//public class MergeSort{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		Integer arr[]= {9,5,8,3,5,2,4,1,11,19,15};
//		
//	//	SORTING THE ARRAY IN ASCENDING ORDER
//		
//		Arrays.sort(arr);
//		
//        for (int x : arr) {
//			System.out.print(x+" ");
//		}
//                
//}
//}