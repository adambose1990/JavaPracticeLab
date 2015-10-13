package com.javapracticelab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise33 {
	public static boolean output1;
	public static void compareDates(String input1, String input2) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date1 = sdf.parse(input1);
			Date date2 = sdf.parse(input2);
			
			if (date1.getTime()<date2.getTime())
				output1 = true;
			else
				output1 = false;
		} catch (ParseException e) {
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) {
		String input1 = new String("01/01/2013");
		String input2 = new String("04/04/2013");
		Exercise33.compareDates(input1, input2);
		System.out.println(Exercise33.output1);
	}
}
