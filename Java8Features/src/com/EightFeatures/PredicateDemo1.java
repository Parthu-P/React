package com.EightFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {

		Person p1=new Person(12,"Parthu");
		Person p2=new Person(17,"Lin");
		Person p3=new Person(19,"Kinny");
		Person p4=new Person(41,"JOhn");
		
		List<Person> asList = Arrays.asList(p1,p2,p3,p4);
		Predicate<Person> age=i->i.age>18;
		for(Person person:asList) {
			if(age.test(person)) {
				System.out.println(person);
			}
		}
	}
}
class Person{
	int age;
	String name;
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}
