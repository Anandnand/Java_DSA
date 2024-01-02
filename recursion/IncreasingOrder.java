//print a number 1 to n increasing order
package com.kod.recursion;


import java.util.Scanner;
public class IncreasingOrder {
	public static void printInc(int n) {
		if(n==1) {
			System.out.println(1);
			return ;
		}
     printInc(n-1);
	     System.out.println(n);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=10;
		printInc(n);
	}

}