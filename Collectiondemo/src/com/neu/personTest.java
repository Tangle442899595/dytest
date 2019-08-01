package com.neu;

import java.util.ArrayList;


public class personTest {

	public static void main(String[] args) {
		ArrayList<person> list = new ArrayList<>();
		list.add(new person(01,"张三",18));
		list.add(new person(02,"李四",16));
		list.add(new person(03,"王五",19));
		
		
		int b = (int)(Math.random()*list.size());
		person p = list.get(b);
		
		System.out.println("请"+(b+1)+"号同学回答这个问题。"+p.getName()+"说：");
		p.Study();
	}

}
