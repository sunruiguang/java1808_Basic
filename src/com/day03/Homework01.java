package com.day03;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		if(m%3==0){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
}
