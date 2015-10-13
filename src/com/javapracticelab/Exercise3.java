package com.javapracticelab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {
	public static String output1;
	public static void getImage(String input1) {
		StringBuffer string = new StringBuffer(input1);
		StringBuffer string1 = new StringBuffer(string);
		string.reverse();
		string1.append("|");
		string1.append(string);
		output1 = string1.toString();
	}

	public static void main(String[] args) throws IOException {
		System.out.print("Enter the word : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Exercise3.getImage(str);
		System.out.println("The mirror image string : "+Exercise3.output1);
	}

}
