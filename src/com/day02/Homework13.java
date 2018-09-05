package com.day02;

import java.util.Scanner;

public class Homework13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你的年龄：");
		int age = sc.nextInt();
		System.out.println();
		if (age >= 18 && age <= 50) {
			System.out.println("恭喜你满足我们的注册条件！");
		} else if (age < 18) {
			System.out.println("不好意思，你未满18周岁！!！");
		} else if (age > 50) {
			System.out.println("不好意思，你年纪太大！！！");
		}
		System.out.println("----------------");
		System.out.print("请输入要判断的年份：");
		int year = sc.nextInt();
		System.out.println();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("恭喜，正好是闰年！");
		} else {
			System.out.println("不好意思，是平年！！！");
		}

	}
}
