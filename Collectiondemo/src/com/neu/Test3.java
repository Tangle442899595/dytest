package com.neu;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		Worker g1 = new Worker("zhang3",18,3000);
		Worker g2 = new Worker("li4",25,3500);
		Worker g3 = new Worker("wang5",22,3200);
		
		list.add(g1);
		list.add(g2);
		list.add(g3);
		System.out.println(list);
		
		list.add(1, new Worker("zhao6",24,3300));
		System.out.println(list);
		
		list.remove(new Worker("wang5",22,3200));
		System.out.println(list);
		
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Object w : list) {
			((Worker)w).work();
		}
	}
	

}
