package com.kod.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

//TIME COMPLEXITY=o(n^2)

//public class MaxWater {
//	public static int storingWater(ArrayList<Integer> height) {
//		int max=0;
//	for(int i=0;i<height.size();i++) {
//		for(int j=i+1;j<height.size();j++) {
//		int	high=Math.min(height.get(i),height.get(j));
//		int width=j-i;
//		int currWater=high*width;
//		max=Math.max(max, currWater);
//		}
//	}
//		return max;
//	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		ArrayList<Integer> height= new ArrayList<>();
//		height.add(8);
//		height.add(7);
//		height.add(9);
//		height.add(3);
//		height.add(2);
//		height.add(1);
//		height.add(9);
//		
//		System.out.println(height);
//		System.out.println("The maximum water can be stored is");
//		System.out.println(storingWater(height));
//	}
//
//}


//TIME COMPLEXITY =o(n)
//TWO POINTER APPROACH

public  class MaxWater{
	public static int storingWater(ArrayList<Integer>height) {
		int lp=0;
		int hp=height.size()-1;
		int max=0;
		while(lp<hp) {
			int high=Math.min(height.get(lp), height.get(hp));
			int width=hp-lp;
			int currWater=high*width;
			 max=Math.max(max, currWater);
			
			if(height.get(lp)<height.get(hp)) {
				lp++;
			}else {
				hp--;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> height=new ArrayList<>();
		
	System.out.println("Enter the length of the height");
		int heightsize=(sc.nextInt());
		System.out.println("Enter the height ");
		for(int i=0;i<=heightsize;i++) {
			height.add(sc.nextInt());
		}
		
			System.out.println(height);
			
			System.out.println("the maximum area of storing water");
			System.out.println(storingWater(height));
	}
	      
}