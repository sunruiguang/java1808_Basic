package com.day03;

import java.util.Scanner;

public class Homework11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		if(week<1||week>7){
			System.out.println("please input integer 1~7");
		}else {
			switch (week) {
			case 6:
			case 7:
				System.out.println("Weekend happy!");
				break;
			default:
				System.out.println("Weekday happy!");
				break;
			}
		}
	}
}
