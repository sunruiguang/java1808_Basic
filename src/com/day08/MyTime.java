package com.day08;

public class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void display() {
		System.out.println(hour + ":" + minute + ":" + second);
	}

	public void addSecod(int sec) {
		second += sec;
		if (second >= 60) {
			minute++;
			if (minute >= 60) {
				hour++;
			}
			minute %= 60;
		}
		second %= 60;
	}

	public void addMinute(int min) {
		minute += min;
		if (minute >= 60) {
			hour++;
		}
		minute %= 60;
	}

	public void addHour(int hou) {
		hour += hou;
	}

	public void subSecond(int sec) {
		second -= sec;
		if (second < 0) {
			second += 60;
			minute--;
			if (minute < 0) {
				minute += 60;
				hour--;
			}
		}
	}

	public void subMinute(int min) {
		minute -= min;
		if (minute < 0) {
			minute += 60;
			hour--;
		}
	}

	public void subHour(int hou) {
		hour -= hou;
	}
}
