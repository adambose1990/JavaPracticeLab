package com.javapracticelab;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exercise45 {
	public static Map<String, Integer> output1; 
	public static void updatePrices(HashMap<String, String> input1, HashMap<String, Integer> input2, int input3, String input4) {
		output1 = new HashMap<String, Integer>();
		output1.putAll(input2);
		Set<String> arrSet = new HashSet<String>();
		Set<String> keyset1 = input1.keySet();
		Iterator<String> it1 = keyset1.iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			if(input4==input1.get(key)) {
				arrSet.add(key);
			}
		}
	
		Set<String> keyset2 = input2.keySet();
		Iterator<String> it2 = keyset2.iterator();
		while(it2.hasNext()) {
			String key = it2.next();
			int value = input2.get(key);
			if(arrSet.contains(key))
				output1.put(key, value+(value*input3/100));
		}
	}
	public static void main(String[] args) {
		Map<String, String> input1 = new HashMap<String, String>();
		Map<String, Integer> input2 = new HashMap<String, Integer>();
		
		input1.put("Lux", "Soap");
		input1.put("Colgate", "Paste");
		input1.put("Pears", "Soap");
		input1.put("Sony", "Electronics");
		input1.put("Samsung", "Electronics");
		
		input2.put("Lux", 1000);
		input2.put("Colgate", 500);
		input2.put("Pears", 2000);
		input2.put("Sony", 100);
		input2.put("Samsung", 600);
		
		int input3 = 10;
		String input4 = "Electronics";

		Exercise45.updatePrices((HashMap<String, String>)input1, (HashMap<String, Integer>)input2, input3, input4);
		System.out.println(Exercise45.output1);
	}

}
