package com.kod.stack;
import java.util.*;
public class ReverseString {
	public static void reverse(String str) {
	 Stack<Character> s=new Stack<>();
	   int index=0;
	   while(index<str.length()) {
	   s.push(str.charAt(index));
	   index++;
	   }
	   StringBuilder result=new StringBuilder("");
	 while(!s.isEmpty()) {
		char curr=s.pop();
		result.append(curr);   
	   }
	 System.out.println(result);
	}
	public static void main(String[] args) {
		String str="hello";
		reverse(str);
		
	}

}
