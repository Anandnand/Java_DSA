package com.kod.greedyalgorithms;
import java.util.*;

public class AmountCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Indamount[]= {2000,500,200,100,50,20,10,5,2,1};
		System.out.println("Enter the amount ");
		int amount=sc.nextInt();
		
		ArrayList<Integer> ai=new ArrayList<>();
		int count=0;
		for(int i=0;i<Indamount.length;i++) {
			if(Indamount[i]<=amount) {
				while(amount>=Indamount[i]) {
						ai.add(Indamount[i]);
						count++;
						amount -=Indamount[i];
				}	
			}
		}
		System.out.println("the maximum notes that are added is "+count);
	for(int i=0;i<ai.size();i++) {
		System.out.println(ai.get(i)+" ");
	}
	
	}

}
