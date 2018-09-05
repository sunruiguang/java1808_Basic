package com.day03;

import java.util.Scanner;

public class Homework10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please the term ...");
		System.out.println("One Year : 2.25%, input integer one");
		System.out.println("Two Year : 2.7%, input integer two");
		System.out.println("Three Year : 3.24%, input integer three");
		System.out.println("Five Year : 3.6%, input integer five");
		int year = sc.nextInt();

		System.out.println("Please enter the amount to deposit:");
		double money = sc.nextDouble();
		double interest = 0;
		switch (year) {
		case 1:
			interest = money * 0.025;
			break;
		case 2:
			interest = money * 0.027 * 2;
			break;
		case 3:
			interest = money * 0.0324 * 3;
			break;
		case 5:
			interest = money * 0.036 * 5;
			break;
		default:
			System.out.println("Please correct the term!");
			break;
		}
		System.out.println("Amount: " + (money + interest));
	}
}
