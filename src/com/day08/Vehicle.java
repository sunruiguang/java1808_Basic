package com.day08;

public class Vehicle {
	double speed;
	double size;

	public Vehicle() {
		super();
	}

	public Vehicle(double speed, double size) {
		this.speed = speed;
		this.size = size;
	}

	public void setSpeed(int speed) {

	}

	public void speedUp() {
		speed++;
	}

	public void speedDown() {
		speed--;
	}

	public void move() {
		System.out.println("ÕýÔÚÒÆ¶¯");
	}

	@Override
	public String toString() {
		return "Vehicle [size=" + size + ", speed=" + speed + "]";
	}

}
