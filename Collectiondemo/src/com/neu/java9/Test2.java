package com.neu.java9;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("5","20","30","40","8","4");
		String list2 = list.stream()
//		.map(x->x*x)
//		.filter(x->x > 20)
//		.limit(20)
//		.sorted()
		.sorted((o1,o2)->Integer.parseInt(o1)-Integer.parseInt(o2))
		.collect(Collectors.joining(","));
//		.forEach(System.out::println);
		System.out.println(list2);
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		IntSummaryStatistics summary = nums.stream().mapToInt(x->x).summaryStatistics();
		
		System.out.println("max="+summary.getMax());
		System.out.println("min="+summary.getMin());
		System.out.println("avg="+summary.getAverage());
		System.out.println("sum="+summary.getSum());
		System.out.println("count="+summary.getCount());
	}

}
