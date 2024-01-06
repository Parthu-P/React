package com.parthu.practice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Demo34 {
	private Integer empId;
	private String empName;
	private String location;

	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getLocation() {
		return location;
	}

	public Demo34(Integer empId, String empName, String location) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Demo34 [empId=" + empId + ", empName=" + empName + ", location=" + location + "]";
	}

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("john");
		queue.add("smith");
		queue.add("orlen");
		queue.add("charles");
		System.out.println(queue);
		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
		System.out.println(iterator.next());
		}
		System.out.println(queue.element());
		
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		
	}

}
