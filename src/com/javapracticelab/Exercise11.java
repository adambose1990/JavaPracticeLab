package com.javapracticelab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise11 {
	public static String output1;
	public static void getDayofWeek(String input1, String input2) {
		SimpleDateFormat sdt = new SimpleDateFormat(input2);
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		try {
			Date day = sdt.parse(input1);
			output1 = sdf.format(day).toUpperCase();
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date format : ");
		String str2 = br.readLine();
		System.out.print("Enter the date of birth : ");
		String str1 = br.readLine();
		Exercise11.getDayofWeek(str1, str2);
		System.out.println(Exercise11.output1);
	}

}
