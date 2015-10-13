package com.javapracticelab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
	public static int output1;
	public static void calculateDifference(int input1) {
		int sum1=0, sum2=0; 
		for (int i=1 ; i<=input1 ; i++) {
			sum1 += i*i;
			sum2 += i;
		}
		output1 = sum1 - (sum2*sum2);
	}
	
	public static void main(String[] args) throws IOException {
		System.out.print("Enter the range : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Exercise2.calculateDifference(n);
		System.out.println("The difference between the sum of the squares of the first "
				+ n
				+ " natural numbers and the square of their sum is : "
				+ Exercise2.output1);
	}

}
