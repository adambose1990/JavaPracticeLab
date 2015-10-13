package com.javapracticelab;

public class Exercise30 {
	public static boolean output1;
	public static void validateCode(String input1) {
		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;
		boolean check4 = false;
		boolean check5 = false;
		boolean check6 = false;
			
		if(input1.length()==6) {
			check1 = true;
		}
			
		if(input1.startsWith("COD")) {
			check2 = true;
		}
			
		int count=0;
		for(int i=0 ; i<input1.length() ; i++){
			if(Character.isDigit(input1.charAt(i))){
				count++;
			}
		}
		if(count>0) {
			check3 = true;
		}
			
		if(Character.isUpperCase(input1.charAt(0))) {
			check4 = true;
		}
			
		check5 = true;
		for(int i=0 ; i<input1.length() ; i++){
			if(!Character.isLetterOrDigit(input1.charAt(i))){
				check5 = false;
			}
		}
			
		int countUp=0, countLow=0;
		for(int i=0 ; i<input1.length() ; i++){
			if(Character.isUpperCase(input1.charAt(i))){
				countUp++;
			}
			if(Character.isLowerCase(input1.charAt(i))){
				countLow++;
			}
		}
		if(countUp>countLow) {
			check6 = true;
		}
			
		if((check1==true)&&(check2==true)&&(check3==true)&&(check4==true)&&(check5==true)&&(check6==true)){
			output1 = true;
		}
		else
			output1 = false;
	}

	public static void main(String[] args) {
		String Code = "COD1xy";
		Exercise30.validateCode(Code);
		System.out.println(Exercise30.output1);
	}
}
