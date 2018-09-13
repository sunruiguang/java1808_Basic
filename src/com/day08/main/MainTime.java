package com.day08.main;

import com.day08.MyTime;

public class MainTime {
	public static void main(String[] args) {
		MyTime myTime = new MyTime(13, 55, 55);
		myTime.display();
		myTime.addHour(12);
		myTime.display();
		myTime.subHour(11);
		myTime.display();
		myTime.addMinute(6);
		myTime.display();
		myTime.subMinute(6);
		myTime.display();
		myTime.addSecod(6);
		myTime.display();
		myTime.subSecond(6);
		myTime.display();
	}
}
