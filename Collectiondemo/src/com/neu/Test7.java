package com.neu;

import java.util.HashSet;
import java.util.Iterator;

public class Test7 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(new Worker("zhang3",18,3000));
		set.add(new Worker("li4",25,3500));
		set.add(new Worker("wang5",22,3200));
		
		Iterator iterator = set.iterator();
		
		Worker worker;
		while(iterator.hasNext()) {
			worker = (Worker)iterator.next();
			
			if(worker.getName().equals("wang5")) {
				iterator.remove();
			}
			
//			System.out.println(worker);
		}
		System.out.println(set);
		
		
		/*for(Object o : set) {
			worker = (Worker)o;
			System.out.println(worker);
		}
*/
	}

}
