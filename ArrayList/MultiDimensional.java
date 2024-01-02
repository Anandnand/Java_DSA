package com.kod.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensional {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  ArrayList<ArrayList<Integer>> main=new ArrayList<>();
	  ArrayList<Integer> list1=new ArrayList<>();
	  ArrayList<Integer> list2=new ArrayList<>();
	  ArrayList<Integer> list3=new ArrayList<>();
	 
	  System.out.println("Enter the size of the list1");
	  int list1size=sc.nextInt();
	  for(int i=0;i<list1size;i++) {
		  System.out.println("Enter the list1 "+i+" elements");
	  list1.add(sc.nextInt());
	  }
	  System.out.println("==============================================================");
	  
	  System.out.println("Enter the size of the list2");
	  int list2size=sc.nextInt();
	  for(int i=0;i<list2size;i++) {
		  System.out.println("Enter the list2 "+i+" elements");
		  list2.add(sc.nextInt());
		  }

	  System.out.println("=========================================================================================");
	  System.out.println("Enter the size of the list3");
	  int list3size=sc.nextInt();
	  for(int i=0;i<list3size;i++) {
		  System.out.println("Enter the list3 "+i+" elements");
		  list3.add(sc.nextInt());
		  }

	 main.add(list1);
	 main.add(list2);
	 main.add(list3);
	 System.out.println("===============================================================");
	 System.out.println("the ArrayList are");
	 System.out.println(main);
	  
//	for(int i=0;i<main.size();i++){	
//		ArrayList<Integer> currList=main.get(i);
//		for(int j=0;j<currList.size();j++) {
//			System.out.print(currList.get(j)+" ");
//		}
//		System.out.println();
//	}
	}
	}

