
package com.kodnest.strings.level2;
import java.util.Arrays;
import java.util.Scanner;

//public class AnagramInStrings {
//	public static void anagram(String str1,String str2) {
//	char arr1[]=str1.toCharArray();
//	for(int i=0;i<arr1.length;i++) {
//		int count=0;
//		for(int j=0;j<arr1.length;j++) {
//			if(arr1[i]==arr1[j]) {
//				count++;
//			}
//		}
//	}
//	char arr2[]=str1.toCharArray();
//	for(int i=0;i<arr2.length;i++) {
//		int temp=0;
//		for(int j=0;j<arr2.length;j++) {
//			if(arr2[i]==arr2[j]) {
//				temp++;
//			}
//		}
//	}
//
//}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//	System.out.println("Enter two Strings");
//		String str1=sc.nextLine();
//		String str2=sc.nextLine();
//	}
//
//}

public class AnagramInStrings {
	public static boolean checkAnagrams(String str1,String str2) {
	char arr1[]=str1.toLowerCase().toCharArray();
	char arr2[]=str2.toLowerCase().toCharArray();	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	     for(int i=0;i<arr1.length;i++) {
	          if(arr1[i]!=arr2[i]) {
	 	           return false;
	           }else {
	        	  continue;
	           }
         }
	     return true;
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter two Strings");
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	checkAnagrams(str1,str2);
	if(str1.length()==str2.length()){
		boolean res=checkAnagrams(str1,str2);
		if(res==true){
			System.out.println("Entered Strings Are Anagrams");
			}else{
				System.out.println("Entered Strings Are Not Anagrams");
				}
		}else{
			System.out.println("Strings Are Not Anagrams");
			}
	}
  }

	
	
	
	