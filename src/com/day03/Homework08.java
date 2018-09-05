package com.day03;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input price: ");
		double price = sc.nextDouble();
		System.out.println();
		System.out.print("Please input number: ");
		int number = sc.nextInt();
		System.out.println();
		System.out.print("Please input money: ");
		double money = sc.nextDouble();
		System.out.println();
		Commodity commodity = new Commodity(price, number, money);
		commodity.output();
	}
}

class Commodity {
	private double price;
	private int number;
	private double money;
	
	public Commodity(double price, int number, double money) {
		super();
		this.price = price;
		this.number = number;
		this.money = money;
	}

	void output() {
		double totalPrice = price * number;
		if(totalPrice >= 500) totalPrice *= 0.8;
		System.out.println("Price: " + totalPrice);
		if(totalPrice > money) System.out.println("Insufficient amount!");
		else System.out.println("Give change: " + (money - totalPrice));
	}
}