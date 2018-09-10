package com.day05;

public class Homework03 {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int result = 0;
		for (int i : a)
			result += i;
		System.out.println(result);
	}
}
