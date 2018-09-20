package com.day14;

public class Homework04 {
	public static void main(String[] args) {
		String str = "name=zs age=18 className=2011011051";
		String[] strArr = str.split("[a-zA-Z]+=");
		for(String s: strArr){
			System.out.println(s);
		}
	}
}
