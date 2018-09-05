package com.day03;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextInt();
		if(score >= 90){
			System.out.println("excellent");
		}else if(score >= 80){
			System.out.println("good");
		}else if(score >= 60){
			System.out.println("pass");
		}else if(score >= 0){
			System.out.println("failed");
		}
	}
}
