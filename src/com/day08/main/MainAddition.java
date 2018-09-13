package com.day08.main;

import com.day08.Addition;

public class MainAddition {
	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println(addition.addition(1, 1));
		System.out.println(addition.addition(1.0, 1.0));
		System.out.println(addition.addition(4.9f, 3.9f));
		System.out.println(addition.addition(1L, 1L));
		System.out.println(addition.addition("s", "s"));
	}
}
