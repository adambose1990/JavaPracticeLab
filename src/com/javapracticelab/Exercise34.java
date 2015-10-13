package com.javapracticelab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise34 {
	public static String[] output1;
	public static void getEmployees(List<String> input1, List<String> input2) {
		List<String> common = new ArrayList<String>();
		for(int i=0 ; i<input1.size() ; i++) {
			if (input2.contains(input1.get(i)))
				common.add(input1.get(i));
		}
		Collections.sort(common);
		output1 = new String[common.size()];
		for(int i=0 ; i<common.size() ; i++) {
			output1[i] = common.get(i);
		}
	}
	public static void main(String[] args) {
		List<String> branch1 = new ArrayList<String>();
		List<String> branch2 = new ArrayList<String>();
		
		branch1.add("arindam");
		branch1.add("praveen");
		branch1.add("debesh");
		branch1.add("koushik");
		branch1.add("rohan");
		
		branch2.add("rohan");
		branch2.add("nilotpal");
		branch2.add("prasenjit");
		branch2.add("arindam");
		branch2.add("kundu");
		
		Exercise34.getEmployees(branch1, branch2);
		System.out.println("The common employees are : ");
		for (int i=0 ; i<Exercise34.output1.length ; i++)	
			System.out.println(Exercise34.output1[i]);
	}

}
