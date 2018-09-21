package com.day15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input date format yyyy-MM-dd:");
		String str = sc.nextLine();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = simpleDateFormat.parse(str);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.YEAR, 3);
			calendar.add(Calendar.MONTH, 3);
			calendar.add(Calendar.DAY_OF_MONTH, 3);
			calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);

			date = calendar.getTime();
			SimpleDateFormat simpleDateFormatOne = new SimpleDateFormat(
					"yyyy-MM-dd E");
			System.out.println("three year three month and three day is: "
					+ simpleDateFormatOne.format(date));

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
