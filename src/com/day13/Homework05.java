package com.day13;

public class Homework05 {
	public static void main(String[] args) {
		String string = "woaizhongguowoaizhongguo";
		int index = 0, count =0;
		while(index >= 0){
			index = string.indexOf("ai", index+1);
			if(index > 0)
				count++;
		}
		System.out.println(count);
	}
}
