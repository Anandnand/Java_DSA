package com.kod.SortingTechniques;

public class HeapSort {
	
	
	public static void heapify(int arr[],int i,int size) {
		int left=2*i+1;
		int right=2*i+2;
		int maxIdx=i;
		
		if(left < size && arr[left]>arr[maxIdx]) {
			maxIdx=left;
		}
		
		if(right < size && arr[right]>arr[maxIdx]) {
			maxIdx=right;
		}
		
		if(maxIdx!=i) {
			int temp=arr[i];
			arr[i]=arr[maxIdx];
			arr[maxIdx]=temp;
			heapify(arr,maxIdx,size);
		}	
	}
	
	
	public static void heap(int arr[]) {
		int n=arr.length;
		//1st build maxHeap
		for(int i=n/2;i>=0;i-- ) {
			heapify(arr,i,n);
		}
		
		//2nd swap first to last
		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			heapify(arr,0,i);
		}	
	}
	public static void main(String[] args) {
		int arr[]= {5,6,3,8,9,1,2};
		heap(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}