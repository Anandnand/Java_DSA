package com.kod.stack;
import java.util.Stack;

public class ReverseStack {
	public static void pushAtBottom(Stack<Integer> st,int data) {
		if(st.isEmpty()) {
			st.push(data);
			return;
		}
		
		int top=st.pop();
		pushAtBottom(st,data);
		st.push(top);
	}
	public static void reverseStack(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int top=st.pop();
		reverseStack(st);
		pushAtBottom(st,top);
	}
	public static void print(Stack<Integer> st) {
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		reverseStack(st);
		print(st);
		
	
	
	}

}
