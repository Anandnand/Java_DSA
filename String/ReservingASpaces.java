package com.kodnest.strings.level1;

import java.util.Scanner;

public class ReservingASpaces {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter a string = ");
	String str=sc.nextLine();
	StringBuffer s1=new StringBuffer();
	
	 char[] crr=str.toCharArray();
	 
	 for(int i=0;i<crr.length-1;i++) {
		 if(crr[i]==crr[i+1]) {
			 continue;
		 }else {
			 s1.append(crr[i]);
		 }
		 
	 }
	 System.out.println(s1);
}
}
