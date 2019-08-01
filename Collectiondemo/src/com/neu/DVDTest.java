package com.neu;

import java.util.HashMap;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;


public class DVDTest {
	public static void main(String[] args) {
		HashMap<String, DVD> map = new HashMap<>();
		
		
		map.put("1",new DVD("《西游记》","可借"," ",0));
		map.put("2", new DVD("《泰坦尼克》","可借"," ",0));
		map.put("3", new DVD("《浪漫满屋》","可借"," ",0));
		map.put("4", new DVD("《风声鹤唳》","可借"," ",0));
		map.put("5", new DVD("《罗马假日》","已借出","2017-01-31",0));
		
		System.out.println("序号\t状态\t名称\t\t借出日期");
		
		
		for(int i = 1;i<=map.size();i++) {
			String a = Integer.toString(i);
			DVD d1 = map.get(a);
			System.out.println(i+"\t"+d1.getState()+"\t"+d1.getName()+"\t"+d1.getData());
		}
		
		
		System.out.println("请输入电影名称");
		Scanner input = new Scanner(System.in);
		String c = Integer.toString(map.size()+1);
		String a = input.nextLine();
		map.put(c,new DVD(a,"可借"," ",0));
		System.out.println("新增"+a+"成功！");
		System.out.println("请输入要删除的DVD名称");
		String b = input.nextLine();
		for(int i = 1;i<=map.size();i++) {
			String d = Integer.toString(i);
			DVD d1 = map.get(d);
			if(d1.getName().equals(b)) {
				map.remove(d);
			}
		}
		
		System.out.println("删除"+b+"成功！");
		System.out.println(map);	
	}
}	
