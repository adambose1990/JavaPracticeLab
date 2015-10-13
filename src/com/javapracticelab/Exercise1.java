package com.javapracticelab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
	public static int output1;
	public static void calculateSum(int input1) {
		for (int i=1 ; i<=input1 ; i++) {
			if ((i%3==0)||(i%5==0))
				output1 += i;
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.print("Enter the range : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Exercise1.calculateSum(n);
		System.out.println("The sum of first " 
				+ n
				+ " natural numbers which are divisible by 3 or 5 is : "
				+ Exercise1.output1);
	}
}