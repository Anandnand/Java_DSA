package com.kod.String;


import java.util.Scanner;

//REVERSING A MUTABLE STRINGS

public class ReverseInBuiltMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		StringBuffer sb=new StringBuffer(sc.nextLine());
		System.out.println("The reversed string is");
		System.out.println(sb.reverse());
		
	}

}
