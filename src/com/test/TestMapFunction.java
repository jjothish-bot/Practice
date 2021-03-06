package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMapFunction {
	
	public static void main(String arg[]) {
	
		List<String> fruit = new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("pineapple");
		fruit.add("kiwi");
		System.out.println("List of Fruit "+fruit);
		List<Integer> list = fruit.stream().map(x->x.length()).collect(Collectors.toList());
		System.out.println("List generated by Map"+list);
	}
}
