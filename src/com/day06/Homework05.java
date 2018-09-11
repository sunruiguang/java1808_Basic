package com.day06;

public class Homework05 {
	public static void main(String[] args) {
		int a = 10101010;
		System.out.println(judgeBit(a));
	}
	
	private static int judgeBit(int a){
		int count = 0;
		while(a>0){
			count++;
			a/=10;
		}
		return count;
	}
}
