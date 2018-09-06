package com.day04;

public class Homework07 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int t = i;
			while (t > 0) {
				int x = t % 10;
				if (x == 7) {
					System.out.print(i + " ");
					break;
				}
				t /= 10;
			}
		}
	}
}
