package com.kod.backtracking;
import java.util.Scanner;
//
//public class Subsets {
//	public static void findSubsets(String str,String ans,int i) {
//		if(i==str.length()) {
//			if(ans.length()== 0) {
//				System.out.println("null");
//			}else {
//				System.out.println(ans);
//			}
//			return;
//		}
//		
//		//if yes is the choice
//		findSubsets(str,ans+str.charAt(i),i+1);
//		
//	    //if no is the choice
//		findSubsets(str,ans,i+1);
//		
//	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str="abcde";
//		findSubsets(str,"",0);
//	}
//
//}
//

public class Subsets {
	public static void findSubsets(String str,String ans,int i) {
		if(i==str.length()) {
			if(ans.length()== 0) {
				System.out.println("null");
			}else {
				System.out.println(ans);
			}
			return;
		}
		
		//if yes is the choice
		findSubsets(str,ans+str.charAt(i),i+1);
		
	    //if no is the choice
		findSubsets(str,ans,i+1);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="abcd";
		findSubsets(str,"",0);
	}

}
