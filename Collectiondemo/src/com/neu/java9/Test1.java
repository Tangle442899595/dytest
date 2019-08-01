package com.neu.java9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Tom","marry","scott");
		
		/*list.forEach((String s)->{
			System.out.println(s);
		});
		
		list.forEach((s)->System.out.println(s));*/
		
		/*Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return (-1)*o1.compareTo(o2);
			}
			
		});*/
		
//		Collections.sort(list, (o1,o2)->(-1)*o1.compareTo(o2));
//		Collections.max(list);
		
//		list.forEach(s->System.out.println(s));
		
		Collections.sort(list);
		Collections.sort(list, (o1,o2)->o1.compareToIgnoreCase(o2));
		
		Collections.sort(list, String::compareToIgnoreCase);
		
		
		list.forEach(System.out::println);		
	}
}
