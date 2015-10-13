package com.javapracticelab;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Exercise21 {
	public static Map<String, String> output1;
	public static void getStates(String input1, String input2, String input3) {
		output1 = new HashMap<String, String>();
		StringTokenizer strToken1 = new StringTokenizer(input1, input3);
		while (strToken1.hasMoreElements()) {
			StringTokenizer strToken2 = new StringTokenizer(strToken1.nextToken(), input2);
			output1.put(strToken2.nextToken(), strToken2.nextToken());
		}
	}
	public static void main(String[] args) {
		String input1 = "tamilnadu||chennai-karanataka||bengaluru";
		String input2 = "||";
		String input3 = "-";
		Exercise21.getStates(input1, input2, input3);
		System.out.println(Exercise21.output1);
	}
}
