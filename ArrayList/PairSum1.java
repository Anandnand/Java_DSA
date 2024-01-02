package com.kod.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class PairSum1 {
	public static void sum(ArrayList<Integer>list) {
		int target=6;
		boolean isFound=false;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++)
			if(list.get(i)+list.get(j)==target) {
			     System.out.println("the sum of two number is "+list.get(i)+" "+list.get(j));  
					isFound=true;
			}
			}
		if(isFound==false) {
		System.out.println("The sum of two number is not equal "+target);
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.println(list);
		sum(list);
	}

}
