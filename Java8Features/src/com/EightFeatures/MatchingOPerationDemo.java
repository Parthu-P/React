package com.EightFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatchingOPerationDemo {

	public static void main(String[] args) {
		Product p1=new Product("SamSung","China");
		Product p2=new Product("Vivo","India");
		Product p3=new Product("Redmi","Japan");
		Product p4=new Product("Nokia","India");
		
		List<Product> ps = Arrays.asList(p1,p2,p3,p4);
		boolean status1 = ps.stream().anyMatch(p->p.manufacture.equals("India"));
		System.out.println(status1);
		
		boolean status2 = ps.stream().allMatch(p->p.manufacture.equals("India"));
	    System.out.println(status2);
	    
	    ps.stream().filter(p->p.manufacture.equals("India")).collect(Collectors.toList()).forEach(p->System.out.println(p));;
	}
}
class Product{
	String name;
	String manufacture;
	
	Product(String name,String manufacture){
		this.manufacture=manufacture;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", manufacture=" + manufacture + "]";
	}
	
	
}

