package com.javapracticelab;

public class Exercise44 {
	public static String output1;
	public static void getNumber(int input1) {
		output1 = new String();
		StringBuffer sbf = new StringBuffer("");
		String str = Integer.toString(input1);
		for (int i=0 ; i<str.length() ; i++) {
			char ch = str.charAt(i);
			String temp = new String();
			switch (ch) {
			case '1':
				temp = "One ";
				break;
			case '2':
				temp = "Two ";
				break;
			case '3':
				temp = "Three ";
				break;
			case '4':
				temp = "Four ";
				break;
			case '5':
				temp = "Five ";
				break;
			case '6':
				temp = "Six ";
				break;
			case '7':
				temp = "Seven ";
				break;
			case '8':
				temp = "Eight ";
				break;
			case '9':
				temp = "Nine ";
				break;
			case '0':
				temp = "Zero ";
				break;
			}
			sbf.append(temp);
		}
		sbf.deleteCharAt(sbf.length()-1);
		output1 = sbf.toString();
	}
	public static void main(String[] args) {
		int input1 = 1230;
		Exercise44.getNumber(input1);
		System.out.println(Exercise44.output1);
	}

}
