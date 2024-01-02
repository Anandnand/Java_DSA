package com.kodnest.strings.level1;

import java.util.Scanner;

public class LengthChecker {
	public static boolean lengthCheck(String str1,String str2) {
		if(str1.length()==str2.length()) {
			return true;
		}else {
		return false;
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter  two string");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		boolean res=lengthCheck(str1,str2);
		if (res==true) {
		System.out.println("Strings are of same length");
		}else {
			System.out.println("Strings  are different length");
		}
		
	}

}
