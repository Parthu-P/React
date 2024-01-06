package com.EightFeatures;

import java.util.Arrays;
import java.util.List;

public class SpliteratorDemo {

	public static void main(String[] args) {
		List<String> spl = Arrays.asList("List","Set","Dequeue","Map");
		spl.stream().spliterator().forEachRemaining(i->System.out.println(i));
		
	}

}
