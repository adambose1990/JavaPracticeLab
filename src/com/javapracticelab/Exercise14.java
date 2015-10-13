package com.javapracticelab;

import java.util.ArrayList;
import java.util.List;

public class Exercise14 {
	public static ArrayList<String> output1;
	public static void removeElements(List<String> input1, List<String> input2) {
		output1 = new ArrayList<String>();
		input1.removeAll(input2);
		output1.addAll(input1);
	}
	public static void main(String[] args) {
		List<String> input1 = new ArrayList<String>();
		List<String> input2 = new ArrayList<String>();
		input1.add("kolkata");
		input1.add("mumbai");
		input1.add("chennai");
		input1.add("bangalore");
		input1.add("delhi");
		input1.add("gurgaon");
		input1.add("patna");
		
		input2.add("kolkata");
		input2.add("bangalore");
		Exercise14.removeElements(input1, input2);
		System.out.println(Exercise14.output1);
	}

}
