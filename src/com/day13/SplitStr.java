package com.day13;

public class SplitStr {
	public static void main(String[] args) {
		String str = "1e2qo4u0932ruwqeo9ur09pewqur9utslajdflSFDIJAL";
		int digitNumber = 0, lowerNumber = 0, upperNumber = 0;
		for(char ch : str.toCharArray()){
			if(Character.isDigit(ch))
				digitNumber++;
			else if(Character.isLowerCase(ch))
				lowerNumber++;
			else if(Character.isUpperCase(ch))
				upperNumber++;
		}
		System.out.println(digitNumber);
		System.out.println(lowerNumber);
		System.out.println(upperNumber);
	}
}
