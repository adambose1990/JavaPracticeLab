package com.javapracticelab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise41 {
	public static boolean output1;
	public static void validateAge(String input1) {
		SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date day = sdt.parse(input1);
			Date toDay = new Date();
			long ageDay = (toDay.getTime() - day.getTime())/(3600000*24);
			long age = ageDay/365;
			if (age > 21)
				output1 = true;
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String input1 = "22-07-1990";
		Exercise41.validateAge(input1);
		System.out.println(Exercise41.output1);
	}
}
