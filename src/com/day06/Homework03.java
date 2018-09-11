package com.day06;

import java.util.Arrays;
import java.util.Comparator;

public class Homework03 {
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(downArr(arr)));
	}
	
	private static Integer[] downArr(Integer[] arr){
		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
			
		});
		return arr;
	}
}
