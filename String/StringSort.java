package com.kod.String;

import java.util.*;

public class StringSort {
	public static void main(String[] args) {
		String[] str= {"pavan","harsha","suhas","chandu"};
		
		TreeSet<String> tr=new TreeSet<>(Comparator.reverseOrder());
		for(int i=0;i<str.length;i++) {
			tr.add(str[i]);
		}
		System.out.println(tr);   
	
	}

}
