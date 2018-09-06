package com.day04;

public class Homework13 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				if (j % 2 != 0)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
