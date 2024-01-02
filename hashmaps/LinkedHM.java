package com.kod.hashmaps;

import java.util.LinkedHashMap;

//IMPLEMENTATION----DOUBLY LINKEDLIST

public class LinkedHM {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("Rajappa", 95);
		lhm.put("Pavan", 90);
		lhm.put("Nayan", 91);
		lhm.put("Harsha", 85);
		lhm.put("Suhas", 89);
		lhm.put("Chandu", 75);
		lhm.put("Shivu", 88);
		System.out.println(lhm);
		System.out.println(lhm.get("Pavan"));
		System.out.println(lhm.remove("Nayan"));
		System.out.println(lhm);
		System.out.println(lhm.size());
	System.out.println(lhm.containsKey("Chandu"));	
		
	}

}
