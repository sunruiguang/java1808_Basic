package com.day06;

public class Homework08 {
	public static void main(String[] args) {
		int a = 100, b = 10;
		System.out.println(sum(a, b));
	}

	private static int sum(int a, int b) {
		int result = 0;
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			result += i;
		}
		return result;
	}
}
