package com.day15;

import java.util.Calendar;

public class Demo01 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);
		System.out.println(year + "y " + month + "m " + day + "d ");
	}
}
