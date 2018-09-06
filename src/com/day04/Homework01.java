package com.day04;

public class Homework01 {
	public static void main(String[] args) {
		int x = 0, count = 0;
		do {
			x /= 10;
			count++;
		} while (x > 0);
		System.out.println(count);
	}
}
