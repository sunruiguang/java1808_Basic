package com.day08.main;

import com.day08.Function;

public class MainFunction {
	public static void main(String[] args) {
		Function function = new Function(1, 2);
		Function function1 = new Function(1, 2, 3);
		Function function2 = new Function("str", "str");
		System.out.println(function.getMax());
		System.out.println(function1.getArea());
		System.out.println(function2.isFlag());
	}
}
