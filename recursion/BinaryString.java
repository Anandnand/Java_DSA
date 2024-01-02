package com.kod.recursion;
import java.util.Scanner;

public class BinaryString {
	public static void printBinString(int n,int lastplace,String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		//for adding 0
		
		printBinString(n-1,0,str+"0");
		
		//for adding 1
		
		if(lastplace==0) {
			printBinString(n-1,1,str+"1");	
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		printBinString(3,0,"");
		
	}

}
