package com.neu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {

	public static void main(String[] args) {
		List<student1> list = new ArrayList<>();
		list.add(new student1("Tom", 18, 100, "class05"));
		list.add(new student1("Jerry", 22, 70, "class04"));
		list.add(new student1("Owen", 25, 90, "class05"));
		list.add(new student1("Jim", 30, 80, "class05"));
		list.add(new student1("Steve", 28, 66, "class06"));
		list.add(new student1("kevin", 24, 100, "class04"));
		int sum = 0;
		for(int i= 0;i<list.size();i++) {
			sum += list.get(i).getAge();
		}
		double b = sum/list.size();                                           
		System.out.println("平均年龄是："+b);
		
		Map<String,Double> map = new HashMap<>();
		map.put("class05", 22.0);
		
	}

}
