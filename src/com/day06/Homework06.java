package com.day06;

import java.util.Arrays;

public class Homework06 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 1, 2, 3, 4, 5, 6 };
		System.out.println(equals(a, b));
	}

	private static boolean equals(int[] a, int[] b) {
		return Arrays.equals(a, b);
	}
}
