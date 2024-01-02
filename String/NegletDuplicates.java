package com.kodnest.strings.level2;

import java.util.Scanner;

public class NegletDuplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.next();
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(!s2.contains(String.valueOf(s1.charAt(i)))){
				s2=s2+s1.charAt(i);	
			}
		}
		System.out.println(s2);

	}
	

}
