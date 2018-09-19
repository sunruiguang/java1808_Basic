package com.day13;

import java.util.Arrays;

public class Homework03 {
	public static void main(String[] args) {
		String str = "test";
		char[] chArr = str.toCharArray();
		char ch = chArr[1];
		chArr[1] = chArr[2];
		chArr[2] = ch;
		str = Arrays.toString(chArr);
		System.out.println(str);
	}
}
