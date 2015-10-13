package com.javapracticelab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise7 {
	public static String output1;
	public static void alterString(String input1) {
		StringBuffer sbf = new StringBuffer(input1);
		
		for (int i=0 ; i<input1.length() ; i++) { 
			char j = input1.charAt(i);
			if ((j=='a')||(j=='A')||(j=='e')||(j=='E')||(j=='i')||(j=='I')||(j=='o')||(j=='O')||(j=='u')||(j=='U')) {
				continue;
			}
			else if (j=='z') {
				sbf.setCharAt(i, 'a');
			}
			else if (j=='Z') {
				sbf.setCharAt(i, 'A');
			}
			else {
				j++;
				sbf.setCharAt(i, j);
			}
		}
		output1 = sbf.toString();
	}
	public static void main(String[] args) throws IOException {
		System.out.print("Enter the word : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Exercise7.alterString(str);
		System.out.println(Exercise7.output1);
	}

}
