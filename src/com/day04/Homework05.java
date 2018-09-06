package com.day04;

public class Homework05 {
	public static void main(String[] args) {
		int i = 0, j = 0;
		do {
			System.out.print("*");
			do {
				System.out.print(" *");
			} while (++j < 4);
			j = 0;
			System.out.println();
		} while (++i < 5);
	}
}
