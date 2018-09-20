package com.day14;

public class Homework01 {
	public static void main(String[] args) {
		String regex = "(\\+86|0086)?\\s*[1]\\d{10}";
		String[] strArr = {"18855036835","+86 28855036835"};
		for(String string: strArr){
			System.out.println(string.matches(regex));
		}
	}
}
