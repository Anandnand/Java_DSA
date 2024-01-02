//import java.util.Arrays;
//
//public class LargestThreeElements {
//	public static void largestThree(int arr[], int n) {
//		Arrays.sort(arr);
//		int larg = arr[n - 1];
//		for (int i = n - 2; i >= 0; i--) {
//			if (arr[i] < larg) {
//				System.out.println("The first largest elemnt is "+larg);
//				System.out.println("The second largest element is "+arr[i]);
//				System.out.println("The third largest element is "+arr[i-1]);
//				return;
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		int arr[] = { 1, 3, 4, 6, 7, 8, 9, 6, 5 };
//		int n = arr.length;
//		largestThree(arr, n);
//
//	}
//
//}
package com.kod.Arrayslevel1;

import java.util.Arrays;
class LargestThreeElements
{
   public static void thirdLargest(int arr[], int n)
    {
	    Arrays.sort(arr);
	    int largest=arr[n-1];
	    for(int i=n-2;i>=0;i--){
	        if(arr[i]<largest) {
	            System.out.print(arr[i-1]);
	            return;
	        }
	    }
    }
    public static void main(String[]args){
        int arr[]={2,4,1,3,5};
        int n=arr.length;
       thirdLargest(arr,n);
    }
}