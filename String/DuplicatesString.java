package com.kod.String;

import java.util.Scanner;

public class DuplicatesString {
		public static void printDuplicates(String str) {
			for(int i=0;i<str.length();i++) {
				for(int j=i+1;j<str.length();j++) {
					if(str.charAt(i)==str.charAt(j)){
						System.out.println(str.charAt(i));
					    break;
						}
		}
	  }	
	}			
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str="harsha";
			printDuplicates(str);
			
		}
	}

