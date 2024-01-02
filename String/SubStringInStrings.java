package com.kodnest.strings.level2;

import java.util.Scanner;

public class SubStringInStrings {
	public static void printSubstring(String str) {
		for (int i=0;i<str.length();i++) {
			String temp="";
		for(int j=i;j<str.length();j++) {
			temp=temp+str.charAt(j);
			System.out.println(temp);	   
		}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		printSubstring(str);
				}

}
