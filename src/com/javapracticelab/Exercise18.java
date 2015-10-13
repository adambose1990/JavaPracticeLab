package com.javapracticelab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise18 {
	public static int[] output1;
	public static void getSorted(int[] input1) {
		output1 = new int[input1.length];
		StringBuffer strTemp;
		List<Integer> arrList = new ArrayList<Integer>();
		for(int i=0 ; i<input1.length ; i++) {
			strTemp = new StringBuffer(new Integer(input1[i]).toString());
			//strTemp = new StringBuffer(Integer.toString(input1[i]));
			strTemp.reverse();
			arrList.add(Integer.parseInt(strTemp.toString()));
		}
		Collections.sort(arrList);
		for(int i=0 ; i<input1.length ; i++) {
			output1[i] = arrList.get(i);
		}
	}
	public static void main(String[] args) {
		int[] input1={12,23,96,45};
		Exercise18.getSorted(input1);
		for (int i=0 ; i<output1.length ; i++) {
			System.out.print(Exercise18.output1[i]+" ");
		}
	}
}
