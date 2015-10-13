package com.javapracticelab;

public class Exercise36 {
	public static int output1;
	public static void getPrimeSum(int input1) {
		output1 = 0;
		int count = 0;
		for (int i=2 ; count<input1 ; i++) {
			int flag = 1;
			for (int j=2 ; j<=i/2 ; j++) {
				if (i % j == 0)
					flag = 0;
			}
			if (flag == 1) {
				output1 += i;
				count++;
			}
		}
	}
	public static void main(String[] args) {
		Exercise36.getPrimeSum(5);
		System.out.println("Sum : "+Exercise36.output1);
	}

}
