package com.day13;

import java.util.Random;

public class Homework04 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < 4; i++) {
			int k = random.nextInt(3);
			switch (k) {
			case 0:
				stringBuffer = stringBuffer.append(random.nextInt(10));
				break;
			case 1:
				stringBuffer = stringBuffer.append((char)('a' + random.nextInt(26)));
				break;
			case 2:
				stringBuffer = stringBuffer.append((char)('A' + random.nextInt(26)));
				break;
			default:
				break;
			}
		}
		System.out.println(stringBuffer.toString());
	}

}
