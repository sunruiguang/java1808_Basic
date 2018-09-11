package com.test;

public class Test01 {
	public static void main(String args[]) {
		int j=0;
		char digit = 'a';
		for (int i = 0; i < 10; i++) {
			switch (digit) {
			case 'x': {
				j = 0;
				System.out.println(j);
			}
			default: {
				j= 100;
				System.out.println(j);
			}
			}
		}
		int i = j;
		System.out.println(i);
	}

}
