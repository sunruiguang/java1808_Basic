package com.day05;

import java.util.Arrays;
import java.util.Random;

public class Homework01 {
	public static void main(String[] args) {
		int[] a = new int[5];
		Random random = new Random();
		int[] a1 = new int[] { random.nextInt(11), random.nextInt(11),
				random.nextInt(11), random.nextInt(11), random.nextInt(11),
				random.nextInt(11) };
		int[] a2 = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
	}
}
