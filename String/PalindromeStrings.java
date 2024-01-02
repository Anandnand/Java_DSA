package com.kod.String;
import java.util.Scanner;

//public class PalindromeStrings {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a name");
//		StringBuilder s1=new StringBuilder(sc.next());
//		System.out.println(s1);
//		StringBuilder s2=new StringBuilder(s1);
//		s2.reverse();
//		System.out.println(s1);
//		if(s1.toString().equals(s2.toString())) {
//			System.out.println("The string is a palindrome");
//		}else {
//			System.out.println("The string is a  not palindrome");	
//		}	
//	}
//}
//

// CHECKING A PALINDROME USING IMMUTABLE STRING

//     public class PalindromeStrings{
//    	 public static boolean reverse(String str) {
//    		 char arr1[]=str.toCharArray();
//    		 char arr2[]=new char[arr1.length];
//    			int j=arr2.length-1;
//    			for(int i=0;i<arr1.length;i++) {
//    				arr2[j]=arr1[i];
//    				j--;
//    			}
//    			String str2=new String(arr2);
//    			if(str.equals(str2)) {
//    				return true;
//    			}
//    		return false;
//    	 }
//    
//    	 public static void main(String[] args) {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter a name");
//			String str=sc.next();
//			boolean res=reverse(str);
//           if(res==true) {
//	            System.out.println("String is plindrome");
//                 }else { 
//	            System.out.println("String is  not plindrome"); 
//            }
//       }
//}

public class PalindromeStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String s1 = sc.next();
		char cr[] = s1.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = cr.length - 1; i >= 0; i--) {
			sb.append(cr[i]);
		}
		String s2 = sb.toString();
		if (s1.equals(s2)) {
			System.out.println("strings are a plindrome");
		} else {
			System.out.println("the strings are not palindrome");
		}

	}
}