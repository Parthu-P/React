package com.EightFeatures;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p=i->i<100;
		System.out.println(p.test(19));
		System.out.println(p.test(200));
		
		String[] names= {"Anil","Anup","Megha","Krithi"};
		Predicate<String> p1=i->i.charAt(0)=='A';
		for(String name:names) {
			if(p1.test(name)) {
				System.out.println(name);
			}
		}
	}

}
