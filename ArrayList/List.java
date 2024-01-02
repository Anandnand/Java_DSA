package com.kod.ArrayList;
import java.util.ArrayList;
public class List {
	public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);
    
    //ADD AN ELEMENT TO LIST
    
    list.add(4,5);
	System.out.println(list);
	
	//REMOVE THE ELEMENT TO THE LIST
	
	list.remove(3);
	System.out.println(list);
	
	//GET AN ELEMENT FROM THE LIST
	int element=list.get(1);
	System.out.println("The element is "+ element);
	
	// SET AN ELEMENT TO LIST
	
	list.set(2,10);
	System.out.println(list);
	
	//CHECK WHETHER THE ELEMENT IS PRESENT OR NOT
	System.out.println(list.contains(7));
	
	//to print the length of the arralist
	
	System.out.println(list.size());

	
	}
	

}
