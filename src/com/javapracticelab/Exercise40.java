package com.javapracticelab;

import java.util.StringTokenizer;

public class Exercise40 {
	public static String output1;
	public static void getSum(double input1) {
		String str = Double.toString(input1);
		StringTokenizer st = new StringTokenizer(str,".");
		StringBuffer sbf = new StringBuffer("");
		while(st.hasMoreElements()){
			String str1 = st.nextToken();
			int sum = 0;
			for (int i=0 ; i<str1.length() ; i++) {
				sum += Integer.parseInt(Character.toString(str1.charAt(i)));
			}
			sbf.append(sum);
			sbf.append(":");
		}
		sbf.deleteCharAt(sbf.length()-1);
		output1 = sbf.toString();
	}
	public static void main(String[] args) {
		double input1 = 120.520;
		Exercise40.getSum(input1);
		System.out.println(Exercise40.output1);
	}
}
