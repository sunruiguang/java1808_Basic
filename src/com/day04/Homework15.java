package com.day04;

import java.util.ArrayList;
import java.util.List;

public class Homework15 {
	public static void main(String[] args) {
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 101; i <= 200; i++) {
			if(isPrime(i)){
				count++;
				list.add(i);
			}
		}
		
		System.out.println(count);
		System.out.println(list.toString());
	}

	private static boolean isPrime(int c) {
		if (c % 2 == 0)
			return false;
		if (c < 1 || c == 2)
			return true;
		for (int i = 3; i <= Math.sqrt(c); i += 2) {
			if (c % i == 0)
				return false;
		}
		return true;
	}
}
