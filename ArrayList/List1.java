package com.kod.ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class List1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//	 System.out.println(list);
//	 System.out.println(list.size());
//	 
	 
	 System.out.println("Enter the size of the arrayList") ;
	 int size=sc.nextInt();
	 for(int i=0;i>=size;i++) {
		list.add(sc.nextInt());
	 }
	 System.out.println(list);
	}

}
