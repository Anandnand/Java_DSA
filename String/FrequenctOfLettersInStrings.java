package com.kodnest.strings.level2;

import java.util.Scanner;

public class FrequenctOfLettersInStrings {
	public static void frequencyOfChar(String str) {
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			int count=0;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i]+"====>"+count);

			
		}
	}
	public static void main(String[] args) {
		String str="nayak";
		frequencyOfChar(str);
	}

}
