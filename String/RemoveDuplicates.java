package com.kodnest.strings.level2;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void removeDuplicates(String str) {
		boolean isDuplicates=false;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					isDuplicates=true;
					System.out.println("The duplicates in a string is"+str.charAt(i));				
                   break;				
				}
			}
			
					}
		if(isDuplicates==false) {
			System.out.println("the duplicates are not present ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		removeDuplicates(str);
	}

	
}
