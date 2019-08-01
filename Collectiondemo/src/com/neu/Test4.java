package com.neu;

import java.util.ArrayList;

public class Test4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for(int i = 1;i<=5;i++) {
			list.add(i);
		}
		for(int i = 0;i<5;i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.toString());
	}
}	
