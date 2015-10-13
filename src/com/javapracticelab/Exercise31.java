package com.javapracticelab;

import java.util.ArrayList;
import java.util.List;

public class Exercise31 {
	public static int output1;
	public static void sumOfFactorial(int input1) {
		List<Integer> arrList = new ArrayList<Integer> ();
		output1 = 0;
		int a=0, b=1, c=0;
		for (int i=1; i<=input1 ;i++)
		{
			arrList.add(a);
			c=a+b;
			a=b;
			b=c;
		}
		
		for(int i=0 ; i<arrList.size() ; i++) {
			int fact=1;
			for(int j=1 ; j<=arrList.get(i) ; j++)
				fact *= j;
			output1 += fact;
		}
	}
	public static void main(String[] args) {
		Exercise31.sumOfFactorial(6);
		System.out.println("Sum : "+Exercise31.output1);
	}
}
