package com.day06;

public class Homework09 {
	public static void main(String[] args) {
		for(int i = 100;i<999;i++){
			if(daffodil(i))
				System.out.println(i);
		}
	}

	private static boolean daffodil(int a) {
		int i = a / 100;
		int j = a / 10 % 10;
		int k = a % 10;
		return a == i * i * i + j * j * j + k * k * k;
	}
}
