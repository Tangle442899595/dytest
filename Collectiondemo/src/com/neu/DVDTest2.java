package com.neu;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DVDTest2 {

	public static void main(String[] args) {
		HashMap<String, DVD> map = new HashMap<>();
		DVD dvd = new DVD("���μ�", "�ɽ�", null, 3);
		map.put(dvd.getName(), dvd);
		dvd = new DVD("̩̹���", "�ɽ�", null, 3);
		map.put(dvd.getName(), dvd);
		dvd = new DVD("��������", "�ɽ�", null, 3);
		map.put(dvd.getName(), dvd);
		dvd = new DVD("�������", "�ɽ�", null, 3);
		map.put(dvd.getName(), dvd);
		dvd = new DVD("�������", "�ɽ�", null, 3);
		map.put(dvd.getName(), dvd);
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("���\t״̬\t����\t\t�������");
		int i = 0;
		String s;
		
		for(String name:map.keySet()) {
			dvd = map.get(name);
			s = dvd.getData() == null?" ":f.format(dvd.getData());
			System.out.println((i+1)+"\t"+dvd.getState()+"\t"+dvd.getName()+"\t"+s);
			i++;
		}
		Scanner input = new Scanner(System.in);
		System.out.println("������DVD���ƣ�");
		String name = input.nextLine();
		
		dvd = new DVD(name,"�ɽ�",null,0);
		map.put(name, dvd);
		System.out.println("����"+name+"�ɹ�");
		
		System.out.println("������ɾ��DVD���ƣ�");
		name = input.nextLine();
		
		dvd = map.remove(name);
		
		if(dvd != null) {
			System.out.println("ɾ���ɹ�");
		}else {
			System.out.println(name+"��dvd������");
		}
		
	}


}
