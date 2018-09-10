package com.day05;

import java.util.Arrays;

public class Homework08 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			a[i] += 5;
			a[i] %= 10;
		}
		System.out.println(Arrays.toString(a));
		swap(a);
		System.out.println(Arrays.toString(a));

	}
	private static void swap(int[] a){
		a[0] = a[0]^a[3];
		a[3] = a[0]^a[3];
		a[0] = a[0]^a[3];
		
		a[1] = a[1]^a[2];
		a[2] = a[1]^a[2];
		a[1] = a[1]^a[2];
	}
}
