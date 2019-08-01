package com.neu;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test6 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		Student stu1 = new Student(1,"tom",20);
		Student stu2 = new Student(2,"marry",20);
		
		set.add(stu1);
		set.add(stu2);
		
//		set.clear();
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains(new Student(1,"marry",20)));
		
		/*System.out.println(set.size());
		
		set.remove(new Student(1,"tom",20));
		
		System.out.println(set);
		
		System.out.println(set.isEmpty());*/
		
		Iterator iterator = set.iterator();		
		
		while(iterator.hasNext()) {
			Object next = iterator.next();//的到下一个元素
			System.out.println(next);
			iterator.remove();
		}
//		iterator.next();
		
		System.out.println(set.size());
	}
}
