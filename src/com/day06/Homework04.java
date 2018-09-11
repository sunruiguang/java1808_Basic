package com.day06;

public class Homework04 {
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6};
		System.out.println(sum(arr));
	}
	
	private static int sum(int[] arr){
		int result = 0;
		for(int i: arr){
			result+=i;
		}
		return result;
	}
}
