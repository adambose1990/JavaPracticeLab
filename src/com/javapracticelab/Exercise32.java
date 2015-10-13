package com.javapracticelab;

public class Exercise32 {
	public static String output1;
	public static void encryptString(String input1) {
		output1 = new String();
		for(int i=0 ; i<input1.length() ; i++){
			if(Character.isUpperCase(input1.charAt(i))){
				char ch = input1.charAt(i);
				ch = (char) (65+((ch+9)-65)%26); //ch = (char)((ch+9)-26*((ch+9)/123));
				output1 = output1.concat(Character.toString(ch));
			}
			else if(Character.isLowerCase(input1.charAt(i))){
				char ch = input1.charAt(i);
				ch = (char) (97+((ch+9)-97)%26); //ch = (char)((ch+9)-26*((ch+9)/123));
				output1 = output1.concat(Character.toString(ch));
			}
			
		}
	}
	public static void main(String[] args) {
		String input1 = new String("ArindamZ");
		Exercise32.encryptString(input1);
		System.out.println(Exercise32.output1);
	}

}
