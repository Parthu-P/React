package com.parthu;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number 1-7");
		int weekNum = sc.nextInt();
		getWeekDay(weekNum);
	}
	public static void getWeekDay(int weekNum) {
		if(weekNum==1) {
			System.out.println("SunDay");
		}
		else if(weekNum==2) {
			System.out.println("MonDay");
		}
		else if(weekNum==3) {
			System.out.println("TuesDay");
		}
		else if(weekNum==4) {
			System.out.println("WednesDay");
		}
		else if(weekNum==5) {
			System.out.println("ThursDay");
		}
		else if(weekNum==6) {
			System.out.println("FriDay");
		}
		else if(weekNum==7) {
			System.out.println("SaterDay");
		}
		else {
			System.out.println("You Entered Inavalid Number..!");
		}
	}

}
