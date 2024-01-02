//FIRST OCCURENCE  IN ARRAY
	package com.kod.recursion;

	
	import java.util.Scanner;
public class FirstOccurence {
		public static int firstOccurence(int arr[],int key ,int i) {
			if(i==arr.length-1) {
				return -1;
			}
			if(arr[i]==key) {
				return i;
			}
			return firstOccurence(arr,key,i+1);
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int arr[]= {2,4,6,3,9,6,7,2,9};
			System.out.println(firstOccurence(arr,7,0));
			
		}
	}


