package com.day08.main;

import java.util.Scanner;

import com.day08.A;

public class MainA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A a = new A();
		while(sc.hasNext()){
			int number = sc.nextInt();
			if(number<a.v){
				System.out.println("С��");
			}else if(number>a.v){
				System.out.println("����");
			}else{
				System.out.println("��ϲ�¶���");
				break;
			}
		}
	}
}
