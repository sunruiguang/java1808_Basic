package com.day08;

public class Truck extends Vehicles{
	float load;
	
	public Truck(){
		
	}
	
	public Truck(String brand, String color,float load){
		super(brand,color);
		this.load = load;
	}
	
	public void showTruck(){
		System.out.println(this.brand+" "+this.color+" "+this.load);
	}
}
