package com.javapracticelab;

import java.util.HashMap;

public class Exercise16 {
	public static HashMap<Integer, Integer> output1;
	public static void getSquares(int[] input1) {
		output1 = new HashMap<Integer, Integer>();
		for (int i=0 ; i<input1.length ; i++) {
			output1.put(input1[i], input1[i]*input1[i]);
		}
	}
	
	public static void main(String[] args) {
		int input1[]={1,2,3,4,5,6,7,8,9};
		Exercise16.getSquares(input1);
		System.out.println(Exercise16.output1);
	}
}
