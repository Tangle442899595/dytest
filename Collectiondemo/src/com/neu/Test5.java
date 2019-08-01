package com.neu;

import java.util.LinkedList;

import javax.management.ListenerNotFoundException;

public class Test5 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("tom");
		list.add("marry");
		
		System.out.println(list);
		
		System.out.println(list.get(1));
		
//		list.add(0,"scott");
		list.addFirst("scott");
		list.addLast("уе╥и");
		System.out.println(list.getLast());

		list.removeLast();
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
	}

}
