package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User{
	private int userId;
	private String name;
	private String city;
	public User(int userId, String name, String city) {
		this.userId = userId;
		this.name = name;
		this.city = city;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return " User [ user Id = "+this.userId+
				", user name = "+this.name+
				", user city = "+this.city+"]";
	}
}

public class TestGroupingBy {
	
	public static void main(String arg[]) {
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1,"Ram","Melborn"));
		userList.add(new User(2,"Nannie","North Carolina"));
		userList.add(new User(3,"Muthu","Melborn"));
		userList.add(new User(4,"Vinodth","Melborn"));
		userList.add(new User(5,"Arun","New york"));
		Map<String, List<User>> cityuserListMap =
				userList.stream().collect(Collectors.groupingBy(User::getCity));
		//System.out.println(cityuserListMap);
		Map<String, Long> cityUserCountMap =
				userList.stream().collect(Collectors.groupingBy(User::getCity,Collectors.counting()));
		System.out.println(cityUserCountMap);
		
	}

}
