package com.javapracticelab;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise35 {
	public static Map<String, Integer> output1;
	public static void getConsolidateFeedback(Map<String, Integer> input1, Map<String, Integer> input2) {
		output1 = new HashMap<String, Integer>();
		Set<String>teacher=new HashSet<String>();
		for(Map.Entry<String, Integer>m:input1.entrySet()) {
			teacher.add(m.getKey());
		}
		for(Map.Entry<String, Integer>m:input2.entrySet()) {
			teacher.add(m.getKey());
		}
		for(String s:teacher) {
			if(input1.containsKey(s) && input2.containsKey(s)) {
				if(input1.get(s)>input2.get(s)) {
					output1.put(s, input1.get(s));
				}
				else
					output1.put(s, input2.get(s));
			}
			else if(input1.containsKey(s)) {
				output1.put(s, input1.get(s));
			}
			else
				output1.put(s, input2.get(s));
		}
	}
	public static void main(String[] args) {
		Map<String, Integer> input1 = new HashMap<String, Integer>();
		Map<String, Integer> input2 = new HashMap<String, Integer>();
		input1.put("arindam", 23);
		input1.put("debesh", 25);
		input1.put("koushik", 17);
		input1.put("praveen", 9);
		input2.put("arindam", 19);
		input2.put("debesh", 12);
		input2.put("amitava", 18);
		Exercise35.getConsolidateFeedback(input1, input2);
		System.out.println(Exercise35.output1);
	}
}
