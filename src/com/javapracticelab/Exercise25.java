package com.javapracticelab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise25 {
	public static char[] output1;
	public static void mergeData(List<Character> input1, List<Character> input2) {
		Set<Character> setInput1 = new HashSet<Character>(input1);
		Set<Character> setInput2 = new HashSet<Character>(input2);
		setInput1.addAll(setInput2);
		output1 = new char[setInput1.size()];
		input1.clear();
		input1.addAll(setInput1);
		Collections.sort(input1);
		for (int i = 0; i < input1.size(); i++) {
			output1[i] = input1.get(i);
		}
	}
	public static void main(String[] args) {
		List<Character> input1=new ArrayList<Character>();
		input1.add('a');
		input1.add('s');
		input1.add('d');
		input1.add('f');
		
		List<Character> input2=new ArrayList<Character>();
		input2.add('z');
		input2.add('x');
		input2.add('c');
		input2.add('f');
		
		Exercise25.mergeData(input1, input2);
		System.out.println(Exercise25.output1);
	}

}
