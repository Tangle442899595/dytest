package com.neu;

import java.util.ArrayList;

public class cuisineTest {

	public static void main(String[] args) {
		ArrayList<Cuisine> list = new ArrayList<>();
		Cuisine a = new Cuisine("������Ƥ", 8, 2);
		Cuisine b = new Cuisine("������", 35, 2);
		list.add(a);
		list.add(b);
		int c = a.getPrise()*a.getAmount()+b.getPrise()*a.getAmount();
		System.out.println("__________________");
		for(Cuisine cui : list) {
			System.out.println(cui.getName()+"\t"+cui.getPrise()+"\t"+cui.getAmount());
		}
		System.out.println("__________________");
		System.out.println("�ܽ�"+c);
		
				

	}

}
