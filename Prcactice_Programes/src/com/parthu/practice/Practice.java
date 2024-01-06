package com.parthu.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class Practice {

	private Integer id;
	private String name;
	private LocalDate dob;
	private Double sal;
	private String domains;

	public Practice(Integer id, String name, LocalDate dob, Double sal, String domains) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.sal = sal;
		this.domains = domains;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public Double getSal() {
		return sal;
	}

	public String getDomains() {
		return domains;
	}

	@Override
	public String toString() {
		return "Practice [id=" + id + ", name=" + name + ", dob=" + dob + ", sal=" + sal + ", domains=" + domains + "]";
	}

	public static void main(String[] args) {

		ArrayList<Practice> al = new ArrayList<>();
		al.add(new Practice(101, "John", LocalDate.of(2001, 6, 21), 1000.0, "Tester"));
		al.add(new Practice(102, "Charles", LocalDate.of(2091, 6, 21), 2000.0, "Developer"));
		al.add(new Practice(101, "Lin", LocalDate.of(2002, 9, 11), 7000.0, "Developer"));
		al.add(new Practice(102, "Char", LocalDate.of(2009, 8, 29), 3000.0, "Tester"));
	
		Optional<Double> d=al.stream().map(Practice::getSal).reduce((a,b)->(a+b));
	
		System.out.println(d);
	}
}
