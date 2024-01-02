package com.kod.stack;
import java.util.ArrayList;

public class StackCreation {
  static class Stack{
		 static ArrayList<Integer> list=new ArrayList<>();
	
		 // check list is Emptyset
		public static boolean emptySet() {
			return list.size()==0;
			}
			
		//PUSH
			public static void push(int data) {
				list.add(data);
			}
			
			//POP
			public static int pop() {
				if(emptySet()) {
					return -1;
				}
				int top=list.get(list.size()-1);
				list.remove(list.size()-1);
				return top;
			}
		
		//	PEEK 
			public static int peek() {
				if(emptySet()) {
					return -1;
				}

				return list.get(list.size()-1);
			}
		}
		
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		
		
	
		while(!s1.emptySet()) {
			System.out.println(s1.peek());
			s1.pop();
		}
		
	}
		
	}
