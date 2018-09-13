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
				System.out.println("小了");
			}else if(number>a.v){
				System.out.println("大了");
			}else{
				System.out.println("恭喜猜对了");
				break;
			}
		}
	}
}
