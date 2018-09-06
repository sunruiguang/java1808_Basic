package com.day04;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		int totalResult = 0;
		System.out.print("s=");
		for (int i = 0; i < b; i++) {
			result += a * Math.pow(10, i);
			totalResult += result;
			if(i == b-1) {
				System.out.print(result);
				break;
			}
			System.out.print(result + "+");
		}
		System.out.println("=" + totalResult);
	}
}
