package com.day02;

public class Homework11 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int c = 1;
		boolean problemOne = a > b ? true : false;
		boolean problemTwo = a > b ? a > c ? true : false : false;
		System.out.println(problemOne);
		System.out.println(problemTwo);
	}
}
