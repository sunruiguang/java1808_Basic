package com.day08.main;

import com.day08.Cars;

public class MainCars {
	public static void main(String[] args) {
		Cars cars = new Cars(4,"yellow", 1);
		
		System.out.println(cars.toString());
		
		cars.addSpeed();
		cars.subSpeed();
		cars.stopSpeed();
	}
}
