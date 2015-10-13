package com.javapracticelab;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Exercise19 {
	public static int[] output1;
	public static void modifyArray(int[] input1) {
		Set<Integer> arrSet = new TreeSet<Integer>();
		for (int i=0 ; i<input1.length ; i++) {
			arrSet.add(input1[i]);
		}
		output1 = new int[arrSet.size()];
		List<Integer> arrList = new ArrayList<Integer>(arrSet);
		ListIterator<Integer> it = arrList.listIterator(arrList.size());
		int i = 0;
		while (it.hasPrevious()) {
			output1[i++] = it.previous();
		}
	}
	public static void main(String[] args) {
		int[] input1 = {1,2,3,6,5,4,1,2,3,5,4,6,2,1,4,5};
		Exercise19.modifyArray(input1);
		for (int i=0 ; i<output1.length ; i++) {
			System.out.print(Exercise19.output1[i]+" ");
		}
	}
}
