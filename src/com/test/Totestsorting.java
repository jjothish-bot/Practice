package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * TO test Employee Objects based up on salary
 * For sorting we could either use comparable or comparator
 */
public class Totestsorting {
	public static void main(String arg[]) {
		/*
		Employee e1 = new Employee(1,"Ram",30000d);
		Employee e2 = new Employee(2,"Kumar",20000d);
		Employee e3 = new Employee(3,"Vinodth",10000d);
		List<Employee> employeeList = new LinkedList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		System.out.println("Before sorting");
		employeeList.stream().forEach(x->{System.out.println(x);});
		Collections.sort(employeeList);
		System.out.println("After sorting");
		employeeList.stream().forEach(x->{System.out.println(x);});
		*/
		List<ExampleEmployee> exampleList = new ArrayList<ExampleEmployee>();
		exampleList.add( new ExampleEmployee(4, "Suresh", 60000d));
		exampleList.add( new ExampleEmployee(5, "Kathiravan", 70000d));
		exampleList.add( new ExampleEmployee(6, "Vijay", 50000d));
		System.out.println("Before sorting");
		exampleList.stream().forEach(x->{System.out.println(x);});
		exampleList.sort((ExampleEmployee e1, ExampleEmployee e2)-> e1.getSalery().intValue() - e2.getSalery().intValue());
		System.out.println("After sorting by salery");
		exampleList.stream().forEach(x->{System.out.println(x);});
		exampleList.sort((ExampleEmployee e1, ExampleEmployee e2)-> e1.getEmployeeName().compareTo(e2.getEmployeeName()));
		System.out.println("After sorting by Name");
		exampleList.stream().forEach(x->{System.out.println(x);});
	}
}
