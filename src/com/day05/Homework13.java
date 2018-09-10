package com.day05;

import java.util.Arrays;

public class Homework13 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 5, 2 };
		int[] index = new int[1000];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (index[arr[i]] == 1){
				arr[i] = -1;
				count++;
			}
			else
				index[arr[i]] = 1;
		}
		int[] arr1 = new int[arr.length - count];
		int j = 0;
		for(int i:arr){
			if(i==-1) continue;
			arr1[j++] = i;
		}
		arr = arr1;
		System.out.println(Arrays.toString(arr));
	}
}
