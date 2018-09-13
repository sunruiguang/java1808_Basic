package com.day08;

public class Vehicles {
	String brand;

	String color;

	public Vehicles() {

	}

	public Vehicles(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public void run() {
		System.out.println("我已经开动了");
	}

	public void showInfo() {
		System.out.println(brand + " " + color);
	}
}
