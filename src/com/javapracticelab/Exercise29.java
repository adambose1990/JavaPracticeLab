package com.javapracticelab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Exercise29 {
	public static List<Integer> output1;
	public static void getValues(HashMap<Integer, Integer> input1) {
		output1 = new ArrayList<Integer>();
		List<Integer> arrKey = new ArrayList<Integer>(input1.keySet());
		Iterator<Integer> it = arrKey.iterator();
		while (it.hasNext()) {
			output1.add(input1.get(it.next()));
		}
		Collections.sort(output1);
	}
	public static void main(String[] args) {
		Map<Integer, Integer> input1 = new HashMap<Integer, Integer>();
		input1.put(1, 23);
		input1.put(2, 45);
		input1.put(3, 56);
		input1.put(4, 12);
		input1.put(5, 21);
		input1.put(6, 47);
		input1.put(7, 85);
		input1.put(8, 54);
		
		Exercise29.getValues((HashMap<Integer, Integer>) input1);
		System.out.println(Exercise29.output1);
	}

}
