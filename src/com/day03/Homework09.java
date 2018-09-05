package com.day03;

import java.util.Scanner;

public class Homework09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your vip code:");
		int vip = sc.nextInt();
		System.out.println("Please input your three price:");
		double[] price = new double[] { sc.nextDouble(), sc.nextDouble(),
				sc.nextDouble() };
		double totalPrice = price[0] + price[1] + price[2];
		double favorablePrice = 0;
		if (vip == 1 && totalPrice >= 100) {
			favorablePrice = totalPrice;
			totalPrice *= 0.8;
			favorablePrice *= 0.2;
			System.out
					.print("You are VIP, reach max favorable conditions. Favorable price is: "
							+ favorablePrice + " You still have to pay: ");
		} else if (totalPrice >= 100) {
			favorablePrice = totalPrice;
			totalPrice *= 0.9;
			favorablePrice *= 0.1;
			System.out
					.print("Sorry, you are common, reach common favorable conditions. Favorable price is: "
							+ favorablePrice + " You still have to pay: ");
		} else {
			System.out
					.println("Sorry, you don't reach favorable conditions. Favorable price is: "
							+ favorablePrice + " Original Pay: ");
		}
		System.out.println(totalPrice);
	}
}
