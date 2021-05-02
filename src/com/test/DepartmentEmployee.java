package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DepartmentEmployee {
	
	public static void main(String arg[]) {
		List<TestDepartment> department = new ArrayList<TestDepartment>();
		TestDepartment t1 = new TestDepartment("SAL","Sales","Sales Department");
		TestDepartment t2 = new TestDepartment("FIN","Finance","Finance Department");
		TestDepartment t3 = new TestDepartment("PRD","Production","Production Department");
		TestDepartment t4 = new TestDepartment("RND","RandD","Research and Development Department");
		
		department.add(t1);
		department.add(t2);
		department.add(t3);
		department.add(t4);
		List<TestEmployee> employee = new ArrayList<TestEmployee>();
		employee.add(new TestEmployee("1","Ram",t1));
		employee.add(new TestEmployee("2","Krishnan",t2));
		employee.add(new TestEmployee("3","Murthy",t3));
		employee.add(new TestEmployee("4","John",t4));
		employee.add(new TestEmployee("5","Murthy",t1));
		employee.add(new TestEmployee("6","John",t2));
		Map<TestDepartment,List<TestEmployee>> resultGroup = employee.stream().collect(Collectors.groupingBy(TestEmployee::getDepartmentId));
		Set<Entry<TestDepartment, List<TestEmployee>>> iterateResult = resultGroup.entrySet();
		Iterator i =iterateResult.iterator();
		while(i.hasNext()) {
			Entry<TestDepartment, List<TestEmployee>> entry = (Entry<TestDepartment, List<TestEmployee>>) i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
