package com.day08;

public class Cars {
	private int tyre;
	private String colorTyre;
	private double weight;
	
	public Cars(){
		
	}
	
	public Cars(int tyre, String colorTyre){
		this.tyre = tyre;
		this.colorTyre = colorTyre;
	}
	
	public Cars(int tyre, String colorTyre,double weight){
		this(tyre,colorTyre);
		this.weight = weight;
	}
	
	public void addSpeed(){
		System.out.println("the car is Speeding");
	}
	
	public void subSpeed(){
		System.out.println("the car is down");
	}
	
	public void stopSpeed(){
		System.out.println("the car is Stopped");
	}

	@Override
	public String toString() {
		return "Cars [colorTyre=" + colorTyre + ", tyre=" + tyre + ", weight="
				+ weight + "]";
	}
	
	
}
