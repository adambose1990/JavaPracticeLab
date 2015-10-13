package com.javapracticelab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise12 {
	public static boolean output1;
	public static void validateUserName (String input1) {
		if((input1.endsWith("_job"))&&(input1.indexOf("_job")>7))
			output1 = true;
		else
			output1 = false;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name : ");
		String str1 = br.readLine();
		Exercise12.validateUserName(str1);
		System.out.println(Exercise12.output1);
	}

}
