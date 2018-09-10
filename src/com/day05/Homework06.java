package com.day05;

import java.util.Arrays;

public class Homework06 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		for(int i = 0;i<a.length;i++){
			a[i] *= 2;
		}
		System.out.println(Arrays.toString(a));
	}
}
