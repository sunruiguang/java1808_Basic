package com.day07;

public class Homework01 {
	public static void main(String[] args) {
		Station station = new Station();
		station.autoCheck("12321");
		station.autoTicketSale(999);
		station.refund("12321", 999);
	}
}