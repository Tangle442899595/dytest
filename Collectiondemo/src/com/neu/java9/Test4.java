package com.neu.java9;


import java.awt.Container;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		Map<Integer, SJB> map = new HashMap<>();
		
		SJB s = new SJB(18, 2006, "�����");
		map.put(s.getYear(), s);
		s = new SJB(17, 2002, "����");
		map.put(s.getYear(), s);
		s = new SJB(16, 1998, "����");
		map.put(s.getYear(), s);
		s = new SJB(15, 1994, "����");
		map.put(s.getYear(),s);
		s = new SJB(14, 1990, "�¹�");
		map.put(s.getYear(), s);
		s = new SJB(13, 1986, "����͢");
		map.put(s.getYear(), s);
		s = new SJB(12, 1982, "�����");
		map.put(s.getYear(), s);
		s = new SJB(11, 1978, "����͢");
		map.put(s.getYear(), s);
		s = new SJB(10, 1974, "�¹�");
		map.put(s.getYear(), s);
		s = new SJB(9, 1970, "����");
		map.put(s.getYear(), s);
		s = new SJB(8, 1966, "Ӣ����");
		map.put(s.getYear(), s);
		s = new SJB(7, 1962, "����");
		map.put(s.getYear(), s);
		s = new SJB(6, 1958, "����");
		map.put(s.getYear(), s);
		s = new SJB(5, 1954, "�¹�");
		map.put(s.getYear(), s);
		s = new SJB(4, 1950, "������");
		map.put(s.getYear(), s);
		s = new SJB(3, 1938, "�����");
		map.put(s.getYear(), s);
		s = new SJB(2, 1934, "�����");
		map.put(s.getYear(), s);
		s = new SJB(1, 1930, "������");
		map.put(s.getYear(), s);
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int a = input.nextInt();
		
		
		s = map.get(a);
		try {
			if(s.getYear()==a) {
				System.out.println("����ھ���"+s.getName());
			}}catch(Exception ex) {
				System.out.println("����û�����籭");
			}
			
		System.out.println("��������ӣ�");
		
		String b = input.next();*/
		for(Integer year:map.keySet()) {
		
			s = map.get(year);
			int y = s.getYear();
			
			if(s.getName().equals("����")) {
			System.out.println(y);
			}
				
		}
				
				
			
	}

}
class SJB{
	private int id;
	private int year;
	private String name;
	public SJB(int id, int year, String name) {
		super();
		this.id = id;
		this.year = year;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SJB [id=" + id + ", year=" + year + ", name=" + name + "]";
	}
	
}