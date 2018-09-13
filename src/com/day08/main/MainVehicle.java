package com.day08.main;

import com.day08.Vehicle;

public class MainVehicle {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(0,1);
		System.out.println(vehicle.toString());
		
		vehicle.speedUp();
		System.out.println(vehicle.toString());
		vehicle.speedDown();
		System.out.println(vehicle.toString());
	}
}
