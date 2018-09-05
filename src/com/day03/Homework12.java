package com.day03;

import java.util.Scanner;

public class Homework12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input amount:");
		int amount = sc.nextInt();
		System.out.println("please input total price");
		double totalPrice = sc.nextDouble();
		if (amount >= 10 && totalPrice >= 10000) {
			totalPrice *= 0.9;
		}
		System.out.println("You have to pay: " + totalPrice);
	}
}
