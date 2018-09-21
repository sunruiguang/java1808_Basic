package com.day15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input date in produced:(yyyy:MM:dd)");
		String dateStr = sc.nextLine();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd");
		try {
			Date date = simpleDateFormat.parse(dateStr);
			System.out.println("Please input live day:");
			int day = sc.nextInt();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.DAY_OF_MONTH, day);
			date = calendar.getTime();
			System.out.println("Expiration Date");
			System.out.println(simpleDateFormat.format(date));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
