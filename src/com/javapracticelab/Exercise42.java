package com.javapracticelab;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise42 {
	public static String output1;
	public static void getDate(int input1) {
		Date toDay = new Date();
		SimpleDateFormat sdf = null;
		switch (input1) {
		case 1:
			sdf = new SimpleDateFormat("MM-dd-yyyy");
			output1 = sdf.format(toDay);
			break;
		case 2:
			sdf = new SimpleDateFormat("dd-MMMM-yyyy");
			output1 = sdf.format(toDay);
			break;
		case 3:
			sdf = new SimpleDateFormat("dd/MM/yyyy");
			output1 = sdf.format(toDay);
			break;
		case 4:
			sdf = new SimpleDateFormat("MM/dd/yyyy");
			output1 = sdf.format(toDay);
			break;
		case 5:
			sdf = new SimpleDateFormat("yyyy");
			output1 = sdf.format(toDay);
			break;
		case 6:
			sdf = new SimpleDateFormat("MMM");
			output1 = sdf.format(toDay);
			break;
		case 7:
			sdf = new SimpleDateFormat("dd/MM/yyyy");
			Calendar c1 = Calendar.getInstance();
			c1.setTime(toDay);
			c1.add(Calendar.DAY_OF_MONTH, 10);
			Date nextDate = c1.getTime();
			output1 = sdf.format(nextDate);
			break;
		case 8:
			sdf = new SimpleDateFormat("dd/MM/yyyy");
			c1 = Calendar.getInstance();
			c1.setTime(toDay);
			c1.add(Calendar.DAY_OF_MONTH, -10);
			nextDate = c1.getTime();
			output1 = sdf.format(nextDate);
			break;
		}
	}
	public static void main(String[] args) {
		int input1 = 8;
		Exercise42.getDate(input1);
		System.out.println(Exercise42.output1);
	}

}
