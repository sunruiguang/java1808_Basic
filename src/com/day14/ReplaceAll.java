package com.day14;

public class ReplaceAll {
	public static void main(String[] args) {
		String str = "12321salkfdsafa2353245";
		str = str.replaceAll("\\d+", "����");
		System.out.println(str);
	}
}
