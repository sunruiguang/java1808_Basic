package com.day03;

public class Homework04 {
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int c = 1;
		boolean flag = a > b ? true : false;
		boolean flag1 = a > b ? a > c ? true : false : false;
		System.out.println(flag + " " + flag1);
	}
}
