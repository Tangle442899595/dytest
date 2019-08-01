package com.neu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Test8 {

	public static void main(String[] args) {
		//ctrl+shift+o
		ArrayList list = new ArrayList();
		
		list.add(new Worker("zhang3",18,3000));
		list.add(new Worker("li4",25,3500));
		list.add(new Worker("wang5",22,3200));
		//匿名内部类：内部类（在一个类中定义另一个类）
		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Worker w1 = (Worker)o1;
				Worker w2 = (Worker)o2;
				return w1.getSalary()-w2.getSalary();
			}
		});
		System.out.println(list);
		
//		Object max = Collections.max(list);
		
		Object max = Collections.max(list,new s());	
		Object obj = Collections.max(list,new SalComparator());
		System.out.println(max);
		
		System.out.println(obj);
		
	}

}


class SalComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Worker w1 = (Worker)o1;
		Worker w2 = (Worker)o2;
		return w1.getSalary()-w2.getSalary();
	}
	
}

class s implements Comparator{

	
	public int compare(Object o1, Object o2) {
		Worker w1 = (Worker)o1;
		Worker w2 = (Worker)o2;
		return w1.getName().compareTo(w2.getName());
	}
	
}
