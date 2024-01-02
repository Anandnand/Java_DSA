package com.kod.hashmaps;
import java.util.TreeMap;


// IMPLEMENTATION---REDBLACKTREE

public class TreeHM {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("Rajappa", 95);
		tm.put("Pavan", 90);
		tm.put("Nayan", 91);
		tm.put("Harsha", 85);
		tm.put("Suhas", 89);
		tm.put("Chandu", 75);
		tm.put("Shivu", 88);
		System.out.println(tm);
		System.out.println(tm.get("Pavan"));
		System.out.println(tm.remove("Nayan"));
		System.out.println(tm);
		System.out.println(tm.size());
		System.out.println(tm.containsKey("Chandu"));

	}

}
