package com.day05;

import java.util.Arrays;
import java.util.Random;

public class Homework11 {
	public static void main(String[] args) {
		int[] a = new int[7];
		int i = 0;
		Random random = new Random();
		while (i < a.length) {
			a[i++] = random.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(a));
		for (int j = 0; j < a.length - 1; j++) {
			for (int k = 0; k < a.length - 1 - j; k++) {
				if (a[k] > a[k + 1]) {
					int temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
