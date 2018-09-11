package com.day06;

import java.util.Arrays;

public class Homework02 {
	public static void main(String[] args) {
		int[] a = {1,43,5,32,2,4,5};
		System.out.println(findMin(a));
		System.out.println(findMax(a));
		
	}
	
	private static int findMin(int[] arr){
		Arrays.sort(arr);
		return arr[0];
	}
	
	private static int findMax(int[] arr){
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
}
