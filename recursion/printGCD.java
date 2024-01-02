package com.kod.recursion;
import java.util.Scanner;

public class printGCD {
	public static int gcd(int m,int n) {
		if(n==0) {
			return m;
		}
	return gcd(n,m%n);
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two integers");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int result=gcd(m,n);
		System.out.println(result);
		
	}

}
