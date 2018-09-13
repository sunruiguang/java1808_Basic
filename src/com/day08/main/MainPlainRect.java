package com.day08.main;

import com.day08.PlainRect;

public class MainPlainRect {
	public static void main(String[] args) {
		PlainRect plainRect = new PlainRect(10, 10, 20, 10);
		System.out.println(plainRect.area());
		System.out.println(plainRect.perimeter());
		System.out.println(plainRect.isInside(25.5, 13));
	}
}
