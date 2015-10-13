package com.javapracticelab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Exercise6 {
	public static Map<String, String> output1;
	public static void getStudents(HashMap<String, Integer> input1) {
		Set<String> keyset = input1.keySet();
		output1 = new HashMap<String, String>();
		Iterator<String> iter = keyset.iterator();
		while (iter.hasNext()) {
			String regNo = (String) iter.next();
			int marks = input1.get(regNo);
			String medal=null;
			if (marks >= 90)
				medal = "Gold";
			else if (marks >= 80 && marks < 90)
				medal = "Silver";
			else if (marks >= 70 && marks < 80)
				medal = "Bronze";
			else
				medal = "No Medal";
			output1.put(regNo, medal);
		}
	}
	public static void main(String[] args) {
		Map<String, Integer> input1 = new HashMap<String, Integer>();
		input1.put("11", 10);
		input1.put("12", 20);
		input1.put("13", 30);
		input1.put("14", 40);
		input1.put("15", 50);
		input1.put("16", 60);
		input1.put("17", 70);
		input1.put("18", 80);
		input1.put("19", 90);
		input1.put("20", 100);
		Exercise6.getStudents((HashMap<String, Integer>) input1);
		System.out.println(Exercise6.output1);
	}
}
