package com.kod.greedyalgorithms;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
	public static void main(String[] args) {
		int weight[]= {10,20,30};
		int value[]= {60,100,120};
		int w=50;
		double ratio[][]=new double[value.length][2];
		for(int i=0;i<value.length;i++) {
			ratio[i][0]=i;
			ratio[i][1]=(double)value[i]/weight[i];
		}
		
		Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
		
		int capacity=w;
		int finalVal=0;
		for(int i=ratio.length-1;i>=0;i--) {
			int idx=(int)ratio[i][0];
			if(capacity>=weight[idx]) {
				finalVal +=value[idx];
				capacity -=weight[idx];
			}else {
				finalVal +=(ratio[i][1]*capacity);
				capacity=0;
				break;
			}
		}
		
System.out.println("finalcapacity of knapsack is "+finalVal);
	}

}
