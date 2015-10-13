package com.javapracticelab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercise8 {
	public static int output1;
	public static void getSecondSmallest(int[] input1) {
		Set<Integer> arrSet = new TreeSet<Integer>();
		for (int i=0 ; i<input1.length ; i++) {
			arrSet.add(input1[i]);
		}
		List<Integer> arrList = new ArrayList<Integer>(arrSet);
		output1 = arrList.get(1);
	}
	public static void main(String[] args) throws IOException {
		int[] input1={11,15,20,30,45,15,11,56};
		Exercise8.getSecondSmallest(input1);
		System.out.println(Exercise8.output1);
	}

}
