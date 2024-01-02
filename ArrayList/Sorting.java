package com.kod.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(900);
		list.add(800);
		System.out.println("The ArrayList is");
		 System.out.println(list);
		 
		 //SORTING IN ASCENDING ORDER
		 
		 System.out.println("the ascending order sorted list");
		 Collections.sort(list);
		 System.out.println(list);
		 
		 //SORTING IN DESCENDING ORDER
		 
		 System.out.println("the sorting in descending order");
		 Collections.sort(list,Collections.reverseOrder());
		 System.out.println(list);
		 
	}

}
