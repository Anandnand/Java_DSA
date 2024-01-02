package com.kod.recursion;
import java.util.Scanner;


//OPTIMIZED POWER USING log()

public class OptimizedPower {
		public static int optimizedPower(int a,int n) {
			if(n==0){
				return 1;	
			}
			int halfpower=optimizedPower(a,n/2);
			
			if(n%2==0) {
				return halfpower*halfpower;
		}else {
			return a*halfpower*halfpower;
		}
			
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int n=sc.nextInt();
		    System.out.println(optimizedPower(a,n));
		}
}

