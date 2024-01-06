package com.parthu;

import java.util.Scanner;

class InvalidNumber extends Exception {
	public InvalidNumber(String msg) {
		super(msg);
	}
}

public class FindWeekDay {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean validInput = false;

        while (!validInput) {
		System.out.println("Enter WeekNumber..(1-7)");
		int number = sc.nextInt();
		int temp=0;
			int weekNum = number - 1;

			try {
				getWeekDay(weekNum);
			} catch (InvalidNumber e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void getWeekDay(int weekNum) throws Exception {
		String[] str = { "Sunday", "Monaday", "Tuesday", "Wednesday", "Thursday", "Friday", "SaterDay" };

		if (weekNum > 0 && weekNum <= str.length)
			System.out.println(str[weekNum]);
		else
			throw new InvalidNumber("You entered invalid number..!");
	}
}
