package com.day04;

import java.util.Scanner;

public class Homework16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input year:");
		int year = sc.nextInt();
		System.out.println("input month");
		int month = sc.nextInt();
		System.out.println("input day");
		int day = sc.nextInt();
		if(isLeapYear(year))
			System.out.println(daysResult(month, day)+1);
		else System.out.println(daysResult(month, day));
		
	}

	private static boolean isLeapYear(int year){
		if(year%4==0&&year%100!=0||year %400==0) return true;
		return false;
	}
	
	private static int daysResult(int month, int day){
		int resultDay = 0;
		for(int i = 1;i<month;i++){
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:				
				resultDay += 31;
				break;
			case 2:
				resultDay+=28;
				break;
			default:
				resultDay+=30;
				break;
			}
		}
		return resultDay;
	}
}
