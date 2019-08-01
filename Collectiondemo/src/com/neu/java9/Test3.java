package com.neu.java9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Tom", "CoreJava");
		map.put("John", "Oracle");
		map.put("Susan", "Oracle");
		map.put("Jerry", "JDBC");
		map.put("Jim", "Unix");
		map.put("Kevin", "JSP");
		map.put("Lucy", "JSP");
		map.put("Allen", "JDBC");
		map.put("Lucy", "CoreJava");
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		for(Entry<String,String> entry:entrySet) {
			System.out.println(entry);
		}
		System.out.println();
		for(Entry<String,String> entry:entrySet) {
			if(entry.getValue().equals("JSP")) {
			System.out.println(entry);}
		}
		
	}
}
