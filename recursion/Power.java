//POWER OF N
package com.kod.recursion;

import java.util.Scanner;
public class Power {
		public static int printPower(int x,int n) {
			if(n==1) {
				return x;
			}
			int snm1=printPower(x,n-1);
			return x*snm1;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		    System.out.println(printPower(2,9));
		}
	}


