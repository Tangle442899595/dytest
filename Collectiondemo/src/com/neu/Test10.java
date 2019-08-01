package com.neu;

import java.util.HashMap;

public class Test10 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		//键是不能重复的，值是可以重复的
		map.put(1, "tom");
		map.put(2, "marry");
		map.put(3, "scott");
		
		map.put(4, "1234");
		
		System.out.println(map);
		

	}

}
