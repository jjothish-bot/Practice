package com.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestQueue {
	
	public static void main(String arg[]) {
		Queue <Integer> q = new LinkedList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input array ");
		String[] intArray = (in.nextLine()).split(" ");
		for(String s:intArray) {
			q.add(Integer.parseInt(s));
		}
		System.out.println("Enter the number of rotation ");
		int n = in.nextInt();
		for (int i=1;i<=n;i++) {
			int temp = q.remove();
			q.add(temp);
		}
		System.out.println("Array elements after "+n+" rotations");
		Iterator iteratorVar = q.iterator();
		while(iteratorVar.hasNext()) {
			System.out.print(iteratorVar.next()+" ");
		}
	}

}
