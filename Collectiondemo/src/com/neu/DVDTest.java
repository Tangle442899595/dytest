package com.neu;

import java.util.HashMap;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;


public class DVDTest {
	public static void main(String[] args) {
		HashMap<String, DVD> map = new HashMap<>();
		
		
		map.put("1",new DVD("�����μǡ�","�ɽ�"," ",0));
		map.put("2", new DVD("��̩̹��ˡ�","�ɽ�"," ",0));
		map.put("3", new DVD("���������ݡ�","�ɽ�"," ",0));
		map.put("4", new DVD("��������ড�","�ɽ�"," ",0));
		map.put("5", new DVD("��������ա�","�ѽ��","2017-01-31",0));
		
		System.out.println("���\t״̬\t����\t\t�������");
		
		
		for(int i = 1;i<=map.size();i++) {
			String a = Integer.toString(i);
			DVD d1 = map.get(a);
			System.out.println(i+"\t"+d1.getState()+"\t"+d1.getName()+"\t"+d1.getData());
		}
		
		
		System.out.println("�������Ӱ����");
		Scanner input = new Scanner(System.in);
		String c = Integer.toString(map.size()+1);
		String a = input.nextLine();
		map.put(c,new DVD(a,"�ɽ�"," ",0));
		System.out.println("����"+a+"�ɹ���");
		System.out.println("������Ҫɾ����DVD����");
		String b = input.nextLine();
		for(int i = 1;i<=map.size();i++) {
			String d = Integer.toString(i);
			DVD d1 = map.get(d);
			if(d1.getName().equals(b)) {
				map.remove(d);
			}
		}
		
		System.out.println("ɾ��"+b+"�ɹ���");
		System.out.println(map);	
	}
}	
