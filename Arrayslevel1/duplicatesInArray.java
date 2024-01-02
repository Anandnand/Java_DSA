package com.kod.Arrayslevel1;

import java.util.Scanner;

public class duplicatesInArray {
	public static void findDuplicates(int arr[]) {
				for(int i=0;i<arr.length;i++) {
					boolean isDuplicates =false;

			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					 isDuplicates=true;
					 break;
				}
			}
			if(isDuplicates) {
			System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {2,5,3,1,7,6,9,8,9,2};
		findDuplicates(arr);
	}

}
