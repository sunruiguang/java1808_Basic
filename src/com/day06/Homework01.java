package com.day06;

import java.util.Arrays;
import java.util.Random;

public class Homework01 {
	public static void main(String[] args) {
		int[] arr = arrRandom();
		System.out.println(Arrays.toString(arr));
	}
	
	private static int[] arrRandom(){
		Random random = new Random();
		int[] arrRandom = new int[6];
		for(int i = 0;i< arrRandom.length;i++){
			arrRandom[i] = random.nextInt(101);
		}
		return arrRandom;
	}
}
