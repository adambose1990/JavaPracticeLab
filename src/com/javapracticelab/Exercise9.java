package com.javapracticelab;

import java.util.ArrayList;

public class Exercise9 {
	public static ArrayList<String> output1;
	
	public static void modifyStrings (String input1, String input2) {
		output1 = new ArrayList<String>();
		StringBuffer sdf1 = new StringBuffer(input1);
		StringBuffer sdf2 = new StringBuffer(input2);
		StringBuffer sdfTemp = new StringBuffer();
		//-------------------Ques1-------------------	
		for (int i=1 ; i<input1.length() ; i+=2) {
			sdfTemp.append(sdf2);
			sdfTemp.append(input1.charAt(i));	
		}
		output1.add(sdfTemp.toString());
		//-------------------Ques2-------------------		
		StringBuffer sdf11 = new StringBuffer(sdf1);
		StringBuffer sdf12 = new StringBuffer(sdf2);
		int index=0;
		int con = Exercise9.count(input1,input2);
		if(con>1) {
			index = sdf11.lastIndexOf(input2);
			sdf11.delete(index, index + input2.length());
			sdf11.insert(index, sdf12.reverse());
		}
		else {
			sdf11.append(input2);
		}
		output1.add(sdf11.toString());
		//-------------------Ques3-------------------
		sdf11 = new StringBuffer(sdf1);
		sdf12 = new StringBuffer(sdf2);
		if(con>1) {
			index = sdf11.indexOf(input2);
			sdf11.delete(index, index + input2.length());
		}
		output1.add(sdf11.toString());
		//-------------------Ques4-------------------
		int beg = (int) Math.ceil(((double)input2.length())/2);
		sdf11 = new StringBuffer(sdf1);
		sdf12 = new StringBuffer(sdf2);
		sdfTemp = new StringBuffer();
		sdfTemp.append(sdf12.substring(0, beg));
		sdfTemp.append(sdf11);
		sdfTemp.append(sdf12.substring(beg, sdf12.length()));
		output1.add(sdfTemp.toString());
		//-------------------Ques5-------------------
		for (int i=0 ; i<input2.length() ; i++) {
			if (input1.contains(Character.toString(input2.charAt(i))))
				input1 = input1.replaceAll((Character.toString(input2.charAt(i))), "*");
		}
		output1.add(input1);
	}
	
	public static int count(String input1, String input2) {
		int index=0;
		int con=0;
		while(index != -1) {
			index = input1.indexOf(input2, index);
			if(index != -1) {
				con++;			
			    index = index + input2.length();
			}
		}
		return con;
	}
	
	public static void main(String[] args) {
		Exercise9.modifyStrings("JAVAJAVA", "VA");
		System.out.println(output1);

	}

}
