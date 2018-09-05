package com.day03;

import java.util.Scanner;

public class Homework14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select shape: rectangle, round, triangle");
		String str = sc.next();
		if (str.equals("rectangle")) {
			System.out.println("Please input length and width: ");
			double length = sc.nextDouble();
			double width = sc.nextDouble();
			double area = length * width;
			System.out.println("Area: " + area);
		} else if (str.equals("round")) {
			System.out.println("Please input radius: ");
			double radius = sc.nextDouble();
			double area = Math.PI * radius * radius;
			System.out.println("Area: " + area);
		} else if (str.equals("triangle")) {
			System.out.println("Please input length of each side: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double l = (a + b + c) / 2;
			double area = Math.sqrt(l*(l - a) * (l - b) * (l - c));
			System.out.println("Area: " + area);
		}
	}
}
