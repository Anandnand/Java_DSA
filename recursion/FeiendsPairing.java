package com.kod.recursion;
import java.util.Scanner;

public class FeiendsPairing {
	public static int totalPairing(int n) {
		if(n==1||n==2) {
			return n;
		}
		
		int singles=totalPairing(n-1);
		
		//pair
		int both=totalPairing(n-2);
		//total ways
        int totalways=(n-1)*both;	
		
		return singles+totalways;
		
		
		///shortcut
		
		//return totalPairing(n-1)+(n-1)*totalPairing(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of students attending party");
		int n=sc.nextInt();
		System.out.println(totalPairing(n));
		
	}

}
