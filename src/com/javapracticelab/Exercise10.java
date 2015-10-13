package com.javapracticelab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise10 {
	public static int output1;
	public static void modifyNumber(int input1) {
		Integer num = new Integer(input1);
		String str = num.toString();
		StringBuffer sbf = new StringBuffer();
		for (int i=0 ; i<str.length()-1 ; i++) {
			Integer num1 = new Integer(str.charAt(i));
			Integer num2 = new Integer(str.charAt(i + 1));
			int diff = Math.abs(num1 - num2);
			sbf.append(diff);
		}
		sbf.append(str.charAt(str.length()-1));
		output1 = Integer.parseInt(sbf.toString());
	}
	public static void main(String[] args) throws IOException {
		System.out.print("Enter the number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Exercise10.modifyNumber(n);
		System.out.println("Increasing Number? : "+Exercise10.output1);
	}
}
