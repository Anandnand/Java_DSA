package com.kod.String;


import java.util.Scanner;

public class ReversingChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st="pavan";
		System.out.println(st);

		StringBuilder sb=new StringBuilder("Pavan");
		System.out.println(sb);
		System.out.println(sb.reverse());
		

		
System.out.println("===================================================================================");

	System.out.println("Enter the character array1 length ");
	char arr1[]=new char[sc.nextInt()];
	System.out.println("Enter the character elemnts");
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=sc.next().charAt(0);
	}
	System.out.println("the array1 characters are");
	for (char c : arr1) {
		System.out.print(c+" ");
		
	}
	System.out.println();
	System.out.println("copy elemnts of array1 to array2");
	char arr2[]=new char[arr1.length];
	for(int i=0;i<arr1.length;i++) {
		arr2[i]=arr1[i];
	}
	for (char d : arr2) {
	System.out.print(d+" ");
	}
	System.out.println();
	System.out.println("The reversed copy elemnts of array2");
	char arr3[]=new char[arr2.length];
	int j=arr3.length-1;
	for(int i=0;i<arr2.length;i++) {
		
		arr3[j]=arr2[i];
		j--;
	}
	for (char e : arr3) {
		System.out.print(e+" ");
		
	}
	}
}
