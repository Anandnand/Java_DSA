package com.kodnest.strings.level1;

import java.util.Scanner;

//public class CountUpperLower {
//	public void ulCount(String str) {
//		int uCount=0;
//		int lCount=0;
//		for(int i=0;i<str.length();i++) {
//			if(Character.isLowerCase(str.charAt(i))) {
//				lCount++;
//			}else {
//				uCount++;
//			}
//		}
//		System.out.println("LowerCase letter "+lCount);
//		System.out.println("UpperCase letter "+uCount);
//	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a string");
//		String str=sc.nextLine();
//		CountUpperLower lp=new CountUpperLower();
//		    lp.ulCount(str);     
//		 	
//	}
//
//}

public class CountUpperLower {
	public void ulCount(String str) {
		int uCount=0;
		int lCount=0;
		for(int i=0;i<str.length();i++) {
		int ch=(int)str.charAt(i);
		
		if(ch>=65 && ch<=90) {
			uCount++;
		}else if(ch>=97 && ch<=122) {
			lCount++;
}
		}
		System.out.println("LowerCase letter "+lCount);
     	System.out.println("UpperCase letter "+uCount);

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		CountUpperLower lp=new CountUpperLower();
		    lp.ulCount(str);
		
	}

}
