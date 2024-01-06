package com.EightFeatures;

import java.util.function.Supplier;

public class MethodRefDemo {

	public static void main(String[] args) {
		Supplier<Employee> s=Employee::new;
		Employee employee = s.get();
		System.out.println(employee.hashCode());
	}
}
class Employee{
	Employee(){
		System.out.println("Employee Constructor...");
	}
}
