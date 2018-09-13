package com.day08.main;

import com.day08.Number;

public class MainNumber {
	public static void main(String[] args) {
		Number number = new Number(2, 3);

		System.out.println(number.addition());
		System.out.println(number.subtration());
		System.out.println(number.multiplication());
		System.out.println(number.division());
	}
}
