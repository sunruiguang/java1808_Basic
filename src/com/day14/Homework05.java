package com.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework05 {
	public static void main(String[] args) {
		String str = "1996-10-17 01:27";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm");
		try {
			Date date = simpleDateFormat.parse(str);
			long time = new Date().getTime() - date.getTime();
			int year = (int) (time / 1000 / 60 / 60 / 24 / 365);
			int day = (int) (time / 1000 / 60 / 60 / 24 % 365);
			int hour = (int) (time / 1000 / 60 / 60 % 24);
			int minute = (int) (time / 1000 / 60 % 60);
			System.out.println(year + "year " + day + "day " + hour + "hour "
					+ minute + "minute");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
