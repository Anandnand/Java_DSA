//import java.util.Scanner;
//
//public class ReverseStrings {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String s1=sc.next();
//	char arr1[]=s1.toCharArray();
//	for (char c : arr1) {
//		System.out.print(c+" ");	
//	}
//	System.out.println();
//	System.out.println("the reversed character array");
//	char arr2[]=new char[arr1.length];
//	int j=arr2.length-1;
//	for(int i=0;i<arr1.length;i++) {
//		arr2[j]=arr1[i];
//		j--;
//	}
//	for (char d : arr2) {
//		System.out.print(d+" ");	
//	}
//	
//	System.out.println();
//	
//     System.out.println("The reversed string is");
//	
//	String s2=new String(arr2);
//	System.out.println(s2);
//	
//	
//		
//	}
//
//}
package com.kod.String;


import java.util.Scanner;

//public class ReverseStrings{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner (System.in);
//		System.out.println("Enter a String ");
//		String str=sc.next();
//		char ch[]=str.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			System.out.print(ch[i]);
//		}
//	}
//}
public class ReverseStrings{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String ");
		String str=sc.next();
	   String str2[]=str.split("");
	   for(int i=str2.length-1;i>=0;i--) {
		   System.out.print(str2[i]);
	   }
	}
}