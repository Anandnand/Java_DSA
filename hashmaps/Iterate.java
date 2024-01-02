package com.kod.hashmaps;

import java.util.*;
import java.util.Map.Entry;

public class Iterate {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Tea", 10);
		hm.put("Coffee", 10);
		hm.put("GingerTea", 15);
		hm.put("GingerTea", 15);
		hm.put("Lemon Tea", 15);
		hm.put("Chikmaglur Coffee", 15);

		// Iterate

		// TO PRINT ONLY KEYS
		 Set<String> keys=hm.keySet();

		// TO PRINT KEY AND VALUES
		//Set<Entry<String, Integer>> keys = hm.entrySet();

		System.out.println(keys);

		for (String k : keys) {
			System.out.println("key="+k+"  "+"values="+hm.get(k));
			
		}
	}
}
