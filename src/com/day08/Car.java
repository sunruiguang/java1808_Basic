package com.day08;

public class Car extends Vehicles {
	int seats;

	public Car() {

	}

	public Car(String brand, String color, int seats) {
		super(brand, color);
		this.seats = seats;
	}

	public void showCar() {
		System.out.println(this.brand + " " + this.color + " " + this.seats);
	}
}
