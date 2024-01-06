package com.EightFeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberSortDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(12);
		ar.add(1);
		ar.add(20);
		ar.add(9);
		System.out.println(ar+" ");
		Collections.sort(ar,new NumberComparators());
		System.out.println(ar+" ");
	}
}
class NumberComparators implements Comparator<Integer>{

	@Override
	public int compare(Integer i, Integer j) {
		if(i>j)
			return -1;
		else if(i<j) {
			return 1;
		}
		return 0;
	}
}
