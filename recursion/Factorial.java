package com.kod.recursion;

import java.util.Scanner;
//print a factorial

public class Factorial {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int fnm1=fact(n-1);
      int fn=n*fnm1;
      return fn;
      
      //      OR
      
     // return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));	
	}
}



