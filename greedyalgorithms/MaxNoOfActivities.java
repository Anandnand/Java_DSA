//You are given  n activities with their start and end  times.Selct the maximum 
//number of activities that can be confirmed by a single person assuming that person
// can only work on  a single activity at a time .Activities are sorted according to end time. 
package com.kod.greedyalgorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxNoOfActivities {
public static void main(String[] args) {
	int start[]= {2,4,1,6,9,8,4};
	int end[]=   {4,6,9,7,10,9,9};
	
	int activities[][]=new int[start.length][3];
	for(int i=0;i<start.length;i++) {
	activities[i][0]=i;
	activities[i][1]=start[i];
	activities[i][2]=end[i];
	}
	Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
	
	for(int i=0;i<start.length;i++) {
		System.out.print("A"+activities[i][0]+" ");
		System.out.println(activities[i][1]+" "+activities[i][2]);
	}

		ArrayList<Integer> ai=new ArrayList<>();	
		int maxAct=0;
		ai.add(activities[0][0]);
		maxAct=1;
		int lastend=activities[0][2];
		for(int i=1;i<end.length;i++) {
			if(activities[i][1]>=lastend) {
				ai.add(activities[i][0]);
				maxAct++;
				lastend=activities[i][2];
			}
		}
		
		System.out.println("\nMaximum number of activities: " + maxAct);
		
		for(int i=0;i<ai.size();i++) {
			System.out.print("A"+ai.get(i)+" ");
			
		}
		
		
	}
}

