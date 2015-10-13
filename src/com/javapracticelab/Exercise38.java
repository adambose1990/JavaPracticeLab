package com.javapracticelab;

import java.util.List;
import java.util.ArrayList;

public class Exercise38 {
	public static List<Integer> output1;
	public static void getFators(int input1) {
		output1 = new ArrayList<Integer>();
		for (int i=1 ; i<=input1 ; i++) {
			if(input1%i==0)
				output1.add(i);
		}
	}
	public static void main(String[] args) {
		int input1 = 4;
		Exercise38.getFators(input1);
		System.out.println(Exercise38.output1);
	}
}
