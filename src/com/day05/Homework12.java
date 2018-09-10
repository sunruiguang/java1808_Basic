package com.day05;

import java.util.Arrays;

public class Homework12 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int[] arr1 = new int[5];
		System.arraycopy(arr, 1, arr1, 1, 3);
		System.out.println(Arrays.toString(arr1));
		System.arraycopy(arr, 0, arr1, 0, 5);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = new int[9];
		System.arraycopy(arr, 0, arr2, 1, 2);
		System.arraycopy(arr, 2, arr2, 3, 2);
		System.arraycopy(arr, 4, arr2, 5, 2);
	}
}
