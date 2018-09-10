package com.day05;

import java.util.Arrays;
import java.util.Random;

public class Homework10 {
	public static void main(String[] args) {
		int[] a = new int[7];
		int[] b = new int[8];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			int index = random.nextInt(7);
			while (b[index] == 1) {
				index = random.nextInt(7);
				System.out.println(index);
			}
			b[index] = 1;
			a[i] = index;
		}
		System.out.println(Arrays.toString(a));
	}
}
