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
		System.out.println("���Ѿ�������");
	}

	public void showInfo() {
		System.out.println(brand + " " + color);
	}
}
