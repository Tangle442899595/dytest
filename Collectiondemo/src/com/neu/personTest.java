package com.neu;

import java.util.ArrayList;


public class personTest {

	public static void main(String[] args) {
		ArrayList<person> list = new ArrayList<>();
		list.add(new person(01,"����",18));
		list.add(new person(02,"����",16));
		list.add(new person(03,"����",19));
		
		
		int b = (int)(Math.random()*list.size());
		person p = list.get(b);
		
		System.out.println("��"+(b+1)+"��ͬѧ�ش�������⡣"+p.getName()+"˵��");
		p.Study();
	}

}
