package com.EightFeatures;

import java.util.Optional;
import java.util.Scanner;

public class OptionalDemo {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int nextInt = sc.nextInt();
		Employees emp=new Employees();
		Optional<String> user = emp.getUser(nextInt);
		if(user.isPresent()) {
			String name = user.get();
			System.out.println(name+", Good Morning");
		}else
			System.out.println("Data not found");
		sc.close();
	}
}
class Employees{
	public Optional<String> getUser(Integer id){
		String name= null;
		if(id==100)
			name="John";
		else if(id==200)
			name ="Lin";
		return Optional.ofNullable(name);
		
	}
}
