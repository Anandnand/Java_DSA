package com.kod.Arrayslevel1;
import java.util.Scanner;

public class RightRotatedArray {
		public static void rightRotated(int arr[],int d,int n) {
			int p=1;
			while(p<=d) {
				int first=arr[n-1];
				for(int i=n-1;i>0;i--) {
					arr[i]=arr[i-1];
				}
				 arr[0]=first;
				 p++;
			}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println("Enter the number of elements to rotated");
		int d=sc.nextInt();
		int n=arr.length;
		rightRotated(arr,d,n);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	}

