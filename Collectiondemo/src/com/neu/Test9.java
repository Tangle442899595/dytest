package com.neu;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test9 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		//���ǲ����ظ��ģ�ֵ�ǿ����ظ���
		map.put(1, "tom");
		map.put(2, "marry");
		map.put(3, "scott");
		
		//�������ļ���
		Set keySet = map.keySet();
		Iterator iterator =  keySet.iterator();
		
		int id;
		Object name;
		/*while(iterator.hasNext()) {
			id = (int)iterator.next();
			name = map.get(id);
			System.out.println(id+"-"+name);
		}*/
		
		for(Object o : keySet) {
			name = map.get(o);
			System.out.println(o+"-"+name);
			
		}
		
		/*System.out.println(map);
		
		Object object = map.get(2);
		System.out.println(object);
		
		map.remove(2);
		System.out.println(map);
		
		System.out.println(map.containsValue("scott"));
		System.out.println(map.size());
		
		Set set = map.keySet();
		System.out.println(set);
		
		Collection values = map.values();
		System.out.println(values);
		
		Set entrySet = map.entrySet();
		System.out.println(entrySet);*/
	}

}
