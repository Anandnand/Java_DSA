//
//public class EvenOrdOdd {
//	public static void EvenOrOdd(int arr[],int n) {
//		int i=-1;
//		int j=0;
//		while(j!=n) {
//			if(arr[j]%2==0) {
//				i++;
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//			j++;
//		}
//		for(int k=0;k<arr.length;k++) {
//			System.out.print(arr[k]+" ");
//		}
//			
//	}
//	public static void main(String[] args) {
//		int arr[] = { 1, 4, 5, 7, 8, 2, 3};
//		int n = arr.length;
//		EvenOrOdd(arr,n);
//		
//
//
//	}
//
//}
package com.kod.Arrayslevel1;


class SegregateEvenOrdOdd {
    void segregateEvenOdd(int arr[], int n) {
		int i=-1;
		int j=0;
		while(j!=n) {
			if(arr[j]%2==0) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j++;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
}
	public static void main(String[] args) {
		int arr[] = { 12, 34, 45, 9, 8, 90, 3};
		int n = arr.length;
		SegregateEvenOrdOdd s=new SegregateEvenOrdOdd();
		s.segregateEvenOdd(arr,n);
	}

}

