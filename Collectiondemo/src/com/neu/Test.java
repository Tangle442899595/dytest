package com.neu;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ArrayList list  = new ArrayList(100);//初始容量为10的空集合
		list.add("tom");
		
		list.add("marry");
		list.add(0, "scoot");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println(list.size());
		
		String s = "tom";
		boolean b = list.contains(s);
		System.out.println(b);
		
	}
}
