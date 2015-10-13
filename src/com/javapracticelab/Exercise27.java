package com.javapracticelab;

public class Exercise27 {
	public static int output1;
	public static void findSum(int input1) {
		output1=0;
		for (int i=0 ; i<=2*input1 ; i+=2) {
			if ((i%3==0)&&(i%8==0))
				output1 += i;
		}
	}
	public static void main(String[] args) {
		Exercise27.findSum(15);
		System.out.println(Exercise27.output1);
	}

}
