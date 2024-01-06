package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Student> hs =new HashSet<>();
		hs.add(new Student(101,"Parthu"));
		hs.add(new Student(102,"Dheksha"));
		hs.add(new Student(103,"Dheksha"));
		hs.add(new Student(104,"Dheksha"));
		
		Iterator iterator=hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
