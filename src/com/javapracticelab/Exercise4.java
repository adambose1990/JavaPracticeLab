package com.javapracticelab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
	public static boolean output1;
	public static void checkNumber(int input1) {
		int i;
		int flag=0;
		int prev = 9;
		while (input1>0) {
			i = input1%10;
			if (i>prev) {
				flag = 1;
				break;
			}
			prev = i;
			input1 /= 10;
		}
		if (flag == 0)
			output1 = true;
		else
			output1 = false;
	}

	public static void main(String[] args) throws IOException {
		System.out.print("Enter the number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Exercise4.checkNumber(n);
		System.out.println("Increasing Number? : "+Exercise4.output1);
	}

}
