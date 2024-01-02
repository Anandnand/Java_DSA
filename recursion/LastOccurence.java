// LAST OCCURENCE IN ARRA
package com.kod.recursion;


import java.util.Scanner;
public class LastOccurence {
		public static int lastOccurence(int arr[],int key ,int i) {
			if(i==arr.length) {
				return -1;
			}
			int isFound=lastOccurence(arr,key,i+1);
			if(isFound==-1 && arr[i]==key) {
				return i;
			}
			return isFound;
			
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int arr[]= {2,4,6,3,9,6,7,2,7};
			System.out.println(lastOccurence(arr,7,0));
			
		}
	}


