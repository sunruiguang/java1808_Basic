package com.day05;

import java.util.Arrays;

public class Homework13 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 5, 2 };
		int[] arr1 = new int[arr.length];
		Arrays.sort(arr);
		boolean[] flag = new boolean[arr[arr.length-1]+1];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!flag[arr[i]]){
				arr1[count] = arr[i];
				count++;
				flag[arr[i]] = true;
			}
		}
		arr = Arrays.copyOf(arr1, count);
		System.out.println(Arrays.toString(arr));
	}
}
