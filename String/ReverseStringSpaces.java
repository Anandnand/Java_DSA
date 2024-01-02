package com.kodnest.strings.level1;

import java.util.Scanner;

//PRESERVING WHITE SPACES

public class ReverseStringSpaces {
	public static String preserveSpaces(String str) {
		
		 char arr[]=str.toCharArray();
		char revarr[]=new char[arr.length];
		for(int i=0;i<str.length();i++) {
		 if(arr[i]==' ') {
			revarr[i]=arr[i];
		}
		}
		int j=revarr.length-1;
		for(int i=0;i<str.length();i++) {
			if(arr[i]!=' ') {
				if(revarr[j]==' ') {
					j--;
				}
				revarr[j]=arr[i];
				j--;
			}
		}
		str=new String(revarr);
        return str;	
	}
		
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("The original string  with reserving white spaces = "+str);

		String s1=preserveSpaces(str);
		System.out.println("The reversed array with reserving white spaces = "+s1);
		
	}

}
