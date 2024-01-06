package com.EightFeatures;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("John","Lin","Kinny","Martin","Camerin","Rohit");
		List<String> cities = Arrays.asList("Hyd","Banglore","Delhi","Chennai","Vizag");
		List<List<String>> address = Arrays.asList(names,cities);
		address.stream().flatMap(i->i.stream()).forEach(s->System.out.println(s));
	}

}
