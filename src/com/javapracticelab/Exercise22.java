package com.javapracticelab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Exercise22 {
	public static List<String> output1;
	public static void checkPerfectCouple(Map<String, String> input1) {
		output1 = new ArrayList<String>();
		Set<String> arrID = input1.keySet();
		Iterator<String> it = arrID.iterator();
		while (it.hasNext()) {
			String id = it.next();
			String name = input1.get(id);
			StringTokenizer strToken = new StringTokenizer(name, "-");
			String husbandName = strToken.nextToken();
			String wifeName = strToken.nextToken();
			Set<Character> setHusband = new HashSet<Character>();
			Set<Character> setWife = new HashSet<Character>();
			for (int i=0 ; i<husbandName.length() ; i++) {
				setHusband.add(husbandName.charAt(i));
			}
			for (int i=0 ; i<wifeName.length() ; i++) {
				setWife.add(wifeName.charAt(i));
			}
			if (setHusband.containsAll(setWife)) {
				output1.add(id);
			}
		}
	}
	public static void main(String[] args) {
		Map<String, String> input1 = new HashMap<String, String>();
		input1.put("abcd100", "debesh-debo");
		input1.put("abcd101", "arin-rinaa");
		input1.put("abcd102", "koushik-praveen");
		input1.put("abcd103", "vimal-maliv");
		Exercise22.checkPerfectCouple(input1);
		System.out.println(Exercise22.output1);
	}

}
