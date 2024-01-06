package com.EightFeatures;

import java.util.ArrayList;
import java.util.Collections;

public class NumberSortedDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(12);
		ar.add(1);
		ar.add(23);
		ar.add(7);
		ar.add(18);
		System.out.println(ar + " ");

		Collections.sort(ar, (i, j) -> (i > j) ? -1 : 1);
		System.out.println(ar + " ");

		ar.forEach(t -> System.out.print(t + " "));// to traverse start to end element
	}

}
