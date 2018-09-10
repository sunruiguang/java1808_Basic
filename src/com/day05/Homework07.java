package com.day05;

import java.util.Arrays;

public class Homework07 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int result = 0;
		for(int i: a){
			result += i;
		}
		a[0] = result;
		System.out.println(Arrays.toString(a));
	}
}
