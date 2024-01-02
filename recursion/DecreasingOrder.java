package com.kod.recursion;
import java.util.Scanner;
//print a number from 1 to n in descending order
public class DecreasingOrder {
		public static void printDec(int n) {
			if(n==1) {
				System.out.println(n);
				return;
			}
			System.out.println(n);
			printDec(n-1);
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=14;
			printDec(n);
			
			
		}
	}


