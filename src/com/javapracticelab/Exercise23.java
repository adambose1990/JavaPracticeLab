package com.javapracticelab;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise23 {
	public static String output1;
	public static void changeString(String input1, char input2) {
		StringBuffer sbf = new StringBuffer();
		switch (input2) {
		case 'A':
			sbf.append(input1);
			sbf.append(input1);
			output1 = new String(sbf);
			break;
		case 'B':
			sbf.append(input1);
			for (int i=1 ; i<input1.length() ; i+=2) {
				sbf.replace(i, i+1, "*");
				output1 = new String(sbf);
			}
			break;
		case 'C':
			char[] charStr = input1.toCharArray();
			Set<Character> charSet = new LinkedHashSet<Character>();
			for (int i=0 ; i<charStr.length ; i++) {
				charSet.add(charStr[i]);
			}
			output1 = new String();
			Iterator<Character> it = charSet.iterator();
			while(it.hasNext()) {
				output1 = output1.concat(it.next().toString());
			}
			break;
		case 'D':
			sbf.append(input1);
			for (int i=1 ; i<input1.length() ; i+=2) {
				sbf.replace(i, i+1, Character.toString(input1.charAt(i)).toUpperCase());
				output1 = new String(sbf);
			}
		}
	}
	public static void main(String[] args) {
		String input1 = new String("arindam");
		Exercise23.changeString(input1, 'D');
		System.out.println(Exercise23.output1);
	}
}
