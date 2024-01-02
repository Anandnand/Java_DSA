package com.kodnest.strings.level1;

import java.util.Scanner;

public class ConcatStrings {
	public static String concat(String str1,String str2) {
		if(str1.length()==str2.length()) {
			String s1=str1.concat(str2);
			return s1;
		}else {
		return null;
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter two strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String res=concat(str1,str2);
		if(res!=null) {
			System.out.println("The concated String is"+res);
		}else {
			System.out.println("The String are not able concat");
			
		}
	}

}
