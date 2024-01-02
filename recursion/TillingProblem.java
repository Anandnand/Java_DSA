//a 2xn board and tiles of size "2x1" count the number of ways to tile the given board using the 2x1
//it can be either vertical or horizontal
package com.kod.recursion;

import java.util.Scanner;
public class TillingProblem {
public static int tilling(int n){
	if(n==0||n==1) {
		return 1;
	}
//	
//	int vertical=tilling(n-1);  // these are the ways for vertical placing
//	int horizontal=tilling(n-2);  // these are the ways for horizontal placing
//	return vertical+horizontal;	
	
	
	//shortcut
	return tilling(n-1)+tilling(n-2);
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the breadth length");
	int n =sc.nextInt();
	System.out.println("the total number of ways of filling tile are "+tilling(n));
}
}
