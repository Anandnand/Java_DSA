package com.kodnest.strings.level1;

import java.util.Scanner;

public class UnicodeOfStrings {
	public static void printUnicode(String str) {
		for(int i=0;i<str.length();i++) {
		System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		for(int i=0;i<str.length();i++) {
		    int unicode=(int)str.charAt(i);
		    System.out.print(unicode+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		 printUnicode(str);
		
	}

}
