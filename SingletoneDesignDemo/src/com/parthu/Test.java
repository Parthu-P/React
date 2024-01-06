package com.parthu;

import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) throws Exception{

		SingletoneDemo s1=SingletoneDemo.getInstances();
		System.out.println(s1.hashCode());
		
		SingletoneDemo s2=SingletoneDemo.getInstances();
		System.out.println(s2.hashCode());
		
		Constructor<SingletoneDemo> s3 = SingletoneDemo.class.getDeclaredConstructor();
		s3.setAccessible(true);
		SingletoneDemo s4 = s3.newInstance();
		System.out.println(s4.hashCode());
		
		
		
	}

}
