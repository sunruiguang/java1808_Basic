package com.day08.main;

import com.day08.Penda;

public class Main {
	public static void main(String[] args) {
		Penda penda = new Penda("����", 3, "�й�", 188);
		System.out.println(penda.toString());
		penda.play();
		penda.yell();
		penda.actingCute();
	}
}
