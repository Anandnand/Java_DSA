package com.kod.stack;
import java.util.Scanner;

public class NextGreater {
	public static void greater(int arr[],int nextGreater[]){
		for(int i=0;i<arr.length;i++) {
			nextGreater[i]=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					nextGreater[i]=arr[j];
					break;
				}
			}
		}
		
for (int x : nextGreater) {
	System.out.print(x+" ");
	
}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int arr[]= {3,1,7,8,9,2,1,0};
    int nextGreater[]=new int[arr.length];
    greater(arr,nextGreater);
	}

}
