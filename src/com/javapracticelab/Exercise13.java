package com.javapracticelab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercise13 {
	public static String[] output1;
	public static void getArrayList (String[] input1) {
		output1 = new String[input1.length];
		List<String> arrList = new ArrayList<String>();
		List<String> arrListFinal = new ArrayList<String>();
		for (int i=0 ; i<input1.length ; i++)
			arrList.add(input1[i]);
		Collections.sort(arrList);
		
		Iterator<String> iter = arrList.iterator();
		int i = 0;
		while (iter.hasNext()) {
			String st = null;
			if (i < arrList.size() / 2) {
				st = new String(iter.next().toUpperCase());
				arrListFinal.add(st);
			} 
			else {
				st = new String(iter.next().toLowerCase());
				arrListFinal.add(st);
			}
			i++;
		}
		
		for (i=0 ; i<input1.length ; i++)
			output1[i] = arrListFinal.get(i);
	}
	
	public static void main(String[] args) {
		String str[] = {"kolkata", "delhi", "mumbai", "chennai"};
		Exercise13.getArrayList(str);
		for (int i=0 ; i<str.length ; i++)
			System.out.println(Exercise13.output1[i]);
	}

}
