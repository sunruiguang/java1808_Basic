package com.day04;

import java.util.Random;
import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		int vectoryCount = 0;
		int loseCount = 0;
		Scanner sc = new Scanner(System.in);
		while(vectoryCount<3&&loseCount<3){
			Random random = new Random();
			int y = random.nextInt(3);
			System.out.println(y);
			int m = sc.nextInt();
			if(m==0&&y==1||m==1&&y==2||m==2&&y==0){
				System.out.println("Vectory£¡");
				vectoryCount++;
				System.out.println("You vectory count: " + vectoryCount);
			}else if(y==0&&m==1||y==1&&m==2||y==2&&m==0){
				System.out.println("Lose!");
				loseCount++;
				System.out.println("You lose count: "+ loseCount);
			}else{
				System.out.println("Draw..");
			}
		}
	}
}
