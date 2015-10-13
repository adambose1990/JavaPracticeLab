package com.javapracticelab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise17 {
	public static List<String> output1;
	public static void votersList(HashMap<String, String> input1) {
		output1 = new ArrayList<String>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date toDay = new Date();
		Set<String> idSet = (Set<String>) input1.keySet();
		Iterator<String> it = idSet.iterator();
		while (it.hasNext()) {
			String id = it.next();
			String dob = input1.get(id);
			try {
				Date doBirth = sdf.parse(dob);
				long ageDay = (toDay.getTime() - doBirth.getTime())/(3600000*24);
				long age = ageDay/365;
				if (age > 18)
					output1.add(id);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		Map<String, String> input1 = new HashMap<String, String>();
		input1.put("abcd001", "01/01/1990");
		input1.put("abcd002", "01/01/1980");
		input1.put("abcd003", "01/01/2000");
		input1.put("abcd004", "01/01/2005");
		input1.put("abcd005", "01/01/1950");
		Exercise17.votersList((HashMap<String, String>) input1);
		System.out.println(Exercise17.output1);
	}
}
