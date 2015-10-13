package com.javapracticelab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {
	public static boolean output1;
	public static void checkNumber(int input1) {
		int flag=0;
		while (input1>1) {
			if (input1%2==1) {
				flag = 1;
				break;
			}
			input1 /= 2;
		}
		if (flag == 0)
			output1 = true;
		else 
			output1 = false;
	}
	
	public static void main(String[] args) throws IOException{
		System.out.print("Enter the number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Exercise5.checkNumber(n);
		System.out.println("Power of 2 : "+Exercise5.output1);
	}

}
