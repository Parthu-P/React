package com.EightFeatures;

import java.util.Comparator;
import java.util.stream.Stream;

public class EmployeeHighestSakary {

	public static void main(String[] args) {
		StreamEmployee e1=new StreamEmployee(101,"John", 10000.0);
		StreamEmployee e2=new StreamEmployee(201,"Lin", 20000.0);
		StreamEmployee e3=new StreamEmployee(301,"Kinny", 30000.0);
		StreamEmployee e4=new StreamEmployee(401,"Camerin", 40000.0);
		StreamEmployee e5=new StreamEmployee(501,"Martin", 50000.0);
		StreamEmployee e6=new StreamEmployee(601,"Merin", 60000.0);
		
		Stream<StreamEmployee> emps = Stream.of(e1,e2,e3,e3,e4,e5,e6);
	}
}
class StreamEmployee{
	int id;
	String name;
	double salary;
	
	StreamEmployee(int id, String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	
}
