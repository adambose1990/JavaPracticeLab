package com.javapracticelab;

public class Exercise39 {
	public static String output1;
	public static String output2;
	public static String output3;
	
	public static void getFormats(int input1) {
		output1 = Integer.toBinaryString(input1);
		output2 = Integer.toOctalString(input1);
		output3 = Integer.toHexString(input1);
	}
	
	public static void main(String[] args) {
		int input1 = 15;
		Exercise39.getFormats(input1);
		System.out.println(Exercise39.output1);
		System.out.println(Exercise39.output2);
		System.out.println(Exercise39.output3);
	}
}
