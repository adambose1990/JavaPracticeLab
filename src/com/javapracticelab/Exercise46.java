package com.javapracticelab;

public class Exercise46 {
	public static boolean output1;
	public static void checkPalindrome(int input1) {
		String str = Integer.toString(input1);
		int flag = 0;
		for (int i=0 ; i<str.length()/2 ; i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			output1 = true;
		else
			output1 = false;
	}
	public static void main(String[] args) {
		int input1 = 12321;
		Exercise46.checkPalindrome(input1);
		System.out.println(Exercise46.output1);
	}
}
