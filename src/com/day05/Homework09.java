package com.day05;

import java.util.Arrays;

public class Homework09 {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 0, 1, 0, 1, 0 };
		int leng = a.length;
		for (int i : a) {
			if (i == 0)
				leng--;
		}
		System.out.println(leng);
		int[] b = new int[leng];
		int j = 0;
		for (int i : a) {
			if (i == 0)
				continue;
			b[j++] = i;
		}
		System.out.println(Arrays.toString(b));
	}
}
