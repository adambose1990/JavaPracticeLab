package com.javapracticelab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise20 {
	public static Map<Character, Integer> output1;
	public static void countCharacter(char[] input1) {
		output1 = new HashMap<Character, Integer>();
		List<Character> arrList = new ArrayList<Character>();
		for (int i=0 ; i<input1.length ; i++) {
			arrList.add(input1[i]);
		}
		for (int i=0 ; i<input1.length ; i++) {
			output1.put(arrList.get(i), Collections.frequency(arrList, arrList.get(i)));
		}
	}
	public static void main(String[] args) {
		char[] input1 = { 'A', 'P', 'P', 'L', 'E' };
		Exercise20.countCharacter(input1);
		System.out.println(Exercise20.output1);
	}

}
