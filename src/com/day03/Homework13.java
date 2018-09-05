package com.day03;

import java.util.Scanner;

public class Homework13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please you want : + or - or * or /");
		String str = sc.next();
		System.out.println("Please input two number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(str == null || str.length() == 0 || str.length() > 1){
			System.out.println("Please correct operator");
			return;
		}
		double result = 0;
		switch (str.charAt(0)) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = 1.0*num1 /num2;
			break;
		default:
			System.out.println("Please correct operator");
			return;
		}
		System.out.println("result: " + result);
		
	}
}
