package com.day02;

import java.util.Scanner;

public class Homework13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������������䣺");
		int age = sc.nextInt();
		System.out.println();
		if (age >= 18 && age <= 50) {
			System.out.println("��ϲ���������ǵ�ע��������");
		} else if (age < 18) {
			System.out.println("������˼����δ��18���꣡!��");
		} else if (age > 50) {
			System.out.println("������˼�������̫�󣡣���");
		}
		System.out.println("----------------");
		System.out.print("������Ҫ�жϵ���ݣ�");
		int year = sc.nextInt();
		System.out.println();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("��ϲ�����������꣡");
		} else {
			System.out.println("������˼����ƽ�꣡����");
		}

	}
}
