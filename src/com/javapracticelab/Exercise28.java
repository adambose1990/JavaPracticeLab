package com.javapracticelab;

public class Exercise28 {
	public static int output1;
	public static void findSum(int input1){
		output1 = 0;
		while (input1>0) {
			int i = input1%10;
			output1 += i*i*i;
			input1 /= 10;
		}
	}
	public static void main(String[] args) {
		Exercise28.findSum(153);
		System.out.println("Sum : "+Exercise28.output1);
	}
}
