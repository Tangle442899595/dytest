package com.neu;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student stu1 = new Student(1,"tom",20);
		Student stu2 = new Student(2,"marry",22);
		Student stu3 = new Student(3,"scott",23);
		Student stu4 = new Student(2,"marry",23);
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		
		for(Student stu:list) {
			String name = stu.getName();
			System.out.println(name);
		}
		
		System.out.println(list);
		
		int index = list.lastIndexOf(new Student(2,"marry",23));
		System.out.println(index);
		
		
		
		
		
		
		/*System.out.println(list.toString());
		
		list.remove(new Student(2,"marry",22));

		
		System.out.println(list.toString());
		*/
		/*list.set(0, new Student(4,"уе╥и",35));
		
		System.out.println(list.toString());
		
		list.remove(1);		
		System.out.println(list.toString());*/
		
		/*Student stu4 = new Student(1,"tom",20);
		
		boolean b = list.contains(stu4);
		System.out.println(b);
		
		Object[] array = list.toArray();
		
		System.out.println(Arrays.toString(array));*/
		
	}
}
