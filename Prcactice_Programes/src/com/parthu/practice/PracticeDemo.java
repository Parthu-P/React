package com.parthu.practice;

import java.util.HashSet;
import java.util.Set;

public class PracticeDemo {

	public static void main(String[] args) {
		//1 2 3 2  4 6 7 3 4 4 9 2 2 
		int[] a= {1,2,3,2,4,6,7,3,4,4,9,2,2};
		//Set<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
		int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}
		}
		//System.out.println(set);
	}
}//select * from employee where name like "pa%;
