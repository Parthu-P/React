package com.EightFeatures;

import java.util.Arrays;
import java.util.List;

public class SlicingOperationDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John","Lin","Kinny","Camerin","Martin","Merin");
		names.stream().limit(4).forEach(c->System.out.println(c));
		System.out.println("===============================");
		names.stream().skip(3).forEach(c->System.out.println(c));
		System.out.println("==================================");
		List<String> name = Arrays.asList("John","Kinny","John","Kinny","Martin","Camerin","Camerin");
		name.stream().distinct().forEach(c->System.out.println(c));
		
	}

}
