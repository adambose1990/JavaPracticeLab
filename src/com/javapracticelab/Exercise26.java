package com.javapracticelab;

import java.util.ArrayList;
import java.util.List;

public class Exercise26 {
	public static List<String> output1;
	public static void modifyElement(List<String> input1, String input2) {
		for (int i=0; i < input1.size(); i++) {
			String str = input1.get(i);
			if(str.equals(input2)){
				StringBuffer sbf = new StringBuffer(input2);
				int len = sbf.length();
				sbf.replace(len/2 , len, "");
				input1.set(i, sbf.toString());
			}
		}
		output1 = new ArrayList<String>(input1);
	}
	public static void main(String[] args) {
		List<String> input1 = new ArrayList<String>();
		input1.add("cognizant");
		input1.add("technology");
		input1.add("solutions");
		String input2 = new String("solutions");
		Exercise26.modifyElement(input1, input2);
		System.out.println(output1);
	}

}
