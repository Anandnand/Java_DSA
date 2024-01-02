package com.kod.hashmaps;

import java.util.HashMap;

//IMPLEMENTATION---ARRAY LINKEDLIST
public class hashingmap {
public static void main(String[] args) {
	HashMap<String ,Integer> hm=new HashMap<>();
	hm.put("Tea", 10);
	hm.put("Coffee", 10);
	hm.put("GingerTea", 15);
	hm.put("GingerTea", 15);
	hm.put("Lemon Tea", 15);
	hm.put("Chikmaglur Coffee", 15);
	System.out.println(hm);
	
	System.out.println(hm.get("Coffee"));
	
	hm.put("Tea", 15);
	System.out.println(hm);
	
	
	System.out.println("The size of hashmap is="+hm.size());
	
	hm.remove("Chikmaglur Coffee");
	System.out.println(hm);

	System.out.println(hm.containsKey("Tea"));
	
	System.out.println(hm.isEmpty());
	
	hm.clear();
	System.out.println(hm);

	
}
}
