package com.neu;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DVDTest2 {

	public static void main(String[] args) {
		HashMap<String, DVD> map = new HashMap<>();
		DVD dvd = new DVD("西游记", "可借", null, 3);
		map.put(dvd.getName(), dvd);
		dvd = new DVD("泰坦尼克", "可借", null, 3);
		map.put(dvd.getName(), dvd);
		dvd = new DVD("浪漫满屋", "可借", null, 3);
		map.put(dvd.getName(), dvd);
		dvd = new DVD("风声鹤唳", "可借", null, 3);
		map.put(dvd.getName(), dvd);
		dvd = new DVD("罗马假日", "可借", null, 3);
		map.put(dvd.getName(), dvd);
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("序号\t状态\t名称\t\t借出日期");
		int i = 0;
		String s;
		
		for(String name:map.keySet()) {
			dvd = map.get(name);
			s = dvd.getData() == null?" ":f.format(dvd.getData());
			System.out.println((i+1)+"\t"+dvd.getState()+"\t"+dvd.getName()+"\t"+s);
			i++;
		}
		Scanner input = new Scanner(System.in);
		System.out.println("请输入DVD名称：");
		String name = input.nextLine();
		
		dvd = new DVD(name,"可借",null,0);
		map.put(name, dvd);
		System.out.println("新增"+name+"成功");
		
		System.out.println("请输入删除DVD名称：");
		name = input.nextLine();
		
		dvd = map.remove(name);
		
		if(dvd != null) {
			System.out.println("删除成功");
		}else {
			System.out.println(name+"的dvd不存在");
		}
		
	}


}
