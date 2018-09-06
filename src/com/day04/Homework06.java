package com.day04;

public class Homework06 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1;i<100;i++){
			if(i%6==0){
				count++;
			}
			if(i%100==0){
				System.out.println("------");
			}
		}
		System.out.println(count);
	}
}
