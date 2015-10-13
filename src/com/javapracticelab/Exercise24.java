package com.javapracticelab;

public class Exercise24 {
	public static boolean output1;
	public static void checkPositive(String input1) {
		char chArr[] = input1.toCharArray();
		output1 = true;
		int prev = 0;
		for (int i=0; i < chArr.length; i++) {
			int num = chArr[i];
			if (num < prev) {
				output1 = false;
				break;
			}
			prev = num;
		}
	}
	public static void main(String[] args) {
		String input1 = new String("APPLE");
		Exercise24.checkPositive(input1);
		System.out.println(Exercise24.output1);
	}
}
