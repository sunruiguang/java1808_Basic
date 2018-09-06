package com.day04;

public class Homework14 {
	public static void main(String[] args) {
		for (int i = 9; i > 0; i--) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(i + "x" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
