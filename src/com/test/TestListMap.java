package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestListMap {
	public static void main(String arg[]) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"Ram",30000d));
		list.add(new Employee(2,"Vinodth",20000d));
		list.add(new Employee(3,"Kannan",50000d));
		Map<Integer,Employee> result1 = list.stream().collect(Collectors.toMap(x->x.getEmployeeID(),x -> x));
		System.out.println(result1);
		Collections.synchronizedMap(result1);
	}
}
