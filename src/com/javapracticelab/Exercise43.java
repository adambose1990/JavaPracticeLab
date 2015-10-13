package com.javapracticelab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise43 {
	public static List<String> output1;
	public static void getMaxSold(HashMap<String, String> input1, HashMap<String, Integer> input2) {
		output1 = new ArrayList<String>();
		
		Set<String> productCat = new HashSet<String>();
		Set<String> input1KeySet = input1.keySet();
		Iterator<String> it = input1KeySet.iterator();
		while(it.hasNext()) {
			productCat.add(input1.get(it.next()));
		}
		
		Iterator<String> it1 = productCat.iterator();
		while (it1.hasNext()) {
			String cat = it1.next();
			
			int maxsale = 0;
			String maxprod = new String();
			
			Set<String> input2KeySet = input2.keySet();
			Iterator<String> it2 = input2KeySet.iterator();
			while(it2.hasNext()) {
				String prod = it2.next();
				int sales = input2.get(prod);
				String prodcat = input1.get(prod);
				if(prodcat == cat) {
					if(sales>maxsale){
						maxsale = sales;
						maxprod = prod;
					}
				}
			}
			output1.add(maxprod);
		}
	}
	public static void main(String[] args) {
		Map<String, String> input1 = new HashMap<String, String>();
		Map<String, Integer> input2 = new HashMap<String, Integer>();
		
		input1.put("Lux", "Soap");
		input1.put("Colgate", "Paste");
		input1.put("Pears", "Soap");
		input1.put("Sony", "Electronics");
		input1.put("Samsung", "Electronics");
		
		input2.put("Lux", 1000);
		input2.put("Colgate", 500);
		input2.put("Pears", 2000);
		input2.put("Sony", 100);
		input2.put("Samsung", 600);

		Exercise43.getMaxSold((HashMap<String, String>)input1, (HashMap<String, Integer>)input2);
		System.out.println(Exercise43.output1);
	}

}
