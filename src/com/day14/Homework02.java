package com.day14;

public class Homework02 {
	public static void main(String[] args) {
		String str = "113@ ere rere qqq com";
		String[] strArr = str.split(" ");
		for(String s : strArr){
			System.out.println(s);
		}
		
		String[] stringArr = str.split("@? ");
		for(String s : stringArr){
			System.out.println(s);
		}
	}
}
