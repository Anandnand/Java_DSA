package com.kod.greedyalgorithms;
import java.util.*;

public class MaxLengthChainPairs {
	public static void main(String[] args) {
		int pairA[]= {5,39,5,27,50};
		int pairB[]= {24,60,28,40,90};
		
		int chains[][]=new int[pairA.length][3];
		for(int i=0;i<pairA.length;i++) {
			chains[i][0]=i;
			chains[i][1]=pairA[i];
			chains[i][2]=pairB[i];
		}
		
		Arrays.sort(chains,Comparator.comparingDouble(o->o[2]));
		
		for(int i=0;i<chains.length;i++) {
			System.out.print("A"+chains[i][0]+" ");
			System.out.println(chains[i][1]+" "+chains[i][2]);
		}
		
		ArrayList<Integer> ai=new ArrayList<>();
		
			int maxChain=0;
			ai.add(chains[0][0]);
			maxChain=1;
			int lastpair=chains[0][2];
			for(int i=0;i<chains.length;i++) {
		     if(chains[i][1]>=lastpair){
		    	 ai.add(chains[i][0]);
		    	 maxChain++;
		    	 lastpair=chains[i][2];		
		}		
		}
			System.out.println("maxchainpairs ="+maxChain);
			for(int i=0;i<ai.size();i++) {
				System.out.println("A"+ai.get(i));
				
			}
		
	}

}
