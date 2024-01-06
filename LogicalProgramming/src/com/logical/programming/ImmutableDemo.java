package com.logical.programming;

public class ImmutableDemo {

	public static void main(String[] args) {

		Player p = new Player(1001, "John");
		System.out.println(p.getId() + "====" + p.getName());
	}
}

final class Player {
	private int id;
	private String name;

	Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
