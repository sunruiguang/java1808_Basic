package com.day03;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=100){
			System.out.println("the longvous");
		}else if(age>=80){
			System.out.println("Aged");
		}else if(age>=66){
			System.out.println("Middle-aged person");
		}else if(age>=18){
			System.out.println("Puber");
		}else if(age>0){
			System.out.println("Juveniles");
		}
	}
}
