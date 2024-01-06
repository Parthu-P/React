package com.EightFeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxAndMinAndAvgSalary {

	public static void main(String[] args) {
		Emp e1 = new Emp(100, "John", 10000.00);
		Emp e2 = new Emp(200, "Cathy", 20000.00);
		Emp e3 = new Emp(300, "Camerin", 30000.00);
		Emp e4 = new Emp(400, "Martin", 40000.00);
		Emp e5 = new Emp(500, "Kotly", 50000.00);

		List<Emp> emps = Arrays.asList(e1, e2, e3, e4, e5);
		Optional<Emp> collect = emps.stream().collect(Collectors.maxBy(Comparator.comparingDouble(e -> e.salary)));
		System.out.println("Max salary  "+collect.get().name+" "+collect.get().salary);
		
		Optional<Emp> collect2 = emps.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
	    System.out.println("Min salry  "+collect2.get().name+" "+collect2.get().salary);
	    
	    Double collect3 = emps.stream().collect(Collectors.averagingDouble(e->e.salary));
	    System.out.println("Avg Salary  "+collect3);
	}
}

class Emp {
	int id;
	String name;
	double salary;

	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
