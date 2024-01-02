package com.kodnest.strings.level1;

import java.util.Scanner;

public class ReversingAWordInSentence{
	public static String reverseStringWord(String str) {
		
		//SPLITTING A SENTENCE
		
		String wordarr[]=str.split(" ");
		String s1=null;
		String revString="";
		
		
		//REVERSING A STRING WORD
		
		for(int i=0;i<wordarr.length;i++) {
			
			//CONVERTING ARRAY TO STRING
			String word=wordarr[i];
			
	     char wa[]=word.toCharArray();
	     char rw[]=new char[wa.length];
	     int j=rw.length-1;
	     for(int k=0;k<wa.length;k++) {
	    	 rw[j]=wa[k];
	    	 j--;
	     }
	         s1 =new String(rw);
	         revString=revString+s1+" ";
		}
		   
		return revString;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("The original string = "+str);

		String sw=reverseStringWord(str);
		System.out.println("The reversed  word  within a sentence = "+sw);
		
	}

}
