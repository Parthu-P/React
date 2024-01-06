package com.EightFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

	public static void main(String[] args) {

		Customer c1=new Customer(100,"John","Hyd");
		Customer c2=new Customer(200,"Cam","Bang");
		Customer c3=new Customer(300,"Lin","Delhi");
		Customer c4=new Customer(400,"Kinny","Channai");
		Customer c5=new Customer(500,"Merin","Vizag");
		
		List<Customer> custs = Arrays.asList(c1,c2,c3,c4,c5);
		
		Map<String, List<Customer>> collect = custs.stream().collect(Collectors.groupingBy(i->i.city));
		System.out.println(collect);
	}
}

class Customer {
	int id;
	String name;
	String city;

	Customer(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
