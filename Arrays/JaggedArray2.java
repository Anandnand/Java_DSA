package com.kod.Arrays;


import java.util.Scanner;

public class JaggedArray2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of companies");
		String [][]arr=new String[sc.nextInt()][];
		 for(int i=0;i<arr.length;i++) {
			 
			 System.out.println("Enter the 2d length for each 1D ");
			 arr[i]=new String[sc.nextInt()];
		 }
	     
		 sc.nextLine();
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Enter the company name");
			  String companies=sc.nextLine();
			 for(int j=0;j<arr[i].length;j++) {
				 System.out.println("the "+companies + i+" courses available are "+j);
			      arr[i][j]=sc.nextLine();
			 }
		 }
	 
		 System.out.println("The courses available in companies are");
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[i].length;j++) {
				 System.out.println(arr[i][j]+" ");
			 }
			 System.out.println("------------------------------------------ ");
		 }
	}
}
