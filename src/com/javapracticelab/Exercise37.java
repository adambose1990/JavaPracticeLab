package com.javapracticelab;

public class Exercise37 {
	public static String output1;
	public static void rearrangeCharacters(String input1) {
		char[] ch = input1.toCharArray();
		int count = 0;
		StringBuffer sbf = new StringBuffer("");
		for (int i=0 ; i<ch.length ; i++) {
			if(ch[i]=='a')
				count++;
		}
		for (int i=0 ; i<count ; i++)
			sbf.append('a');
		for (int i=0 ; i<ch.length ; i++) {
			if(ch[i] != 'a')
				sbf.append(ch[i]);
		}
		output1 = sbf.toString();
	}
	
	public static void main(String[] args) {
		String input1 = new String("arindaam");
		Exercise37.rearrangeCharacters(input1);
		System.out.println(Exercise37.output1);
	}
}
