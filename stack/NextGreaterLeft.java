package com.kod.stack;
import java.util.Stack;

public class NextGreaterLeft {
		public static void nextGreat(int arr[],int nextgreater[]) {
			Stack<Integer> st=new Stack<>();
			for(int i=0;i<arr.length;i++) {
				while(!st.isEmpty() && arr[st.peek()]<=arr[i] ) {
				st.pop();
			}
				if(st.isEmpty()) {
					nextgreater[i]=-1;
				}else {
					nextgreater[i]=arr[st.peek()];
				}
				st.push(i);
				
			}
			for(int x: nextgreater) {
				System.out.print(x+" ");
				
			}

		}
		
		
		public static void main(String[] args) {
			
			int arr[]= {5,8,9,4,5,6,1,0};
			int nextgreater[]=new int[arr.length];
			nextGreat(arr,nextgreater);
		}

}



