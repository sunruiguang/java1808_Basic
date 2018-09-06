package com.day04;

public class Homework10 {
	public static void main(String[] args) {
		int x = 123;
		int result = 0, i =2;
		while(x>0){
			result += (x%10)*Math.pow(10, i--);
			x/=10;
		}
		System.out.println(result);
	}
}
