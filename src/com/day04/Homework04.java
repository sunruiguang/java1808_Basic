package com.day04;

public class Homework04 {
	public static void main(String[] args) {
		int result = 0, i = 0;
		while(i<100){
			if(i%2!=0){
				result += i;
				System.out.print(i + "+");
			}
			i++;
		}
		System.out.println("=" + result);
	}
}
