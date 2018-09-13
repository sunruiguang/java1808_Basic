package com.day08;

public class Function {
	int max;
	double area;
	boolean flag;
	
	public Function(int a, int b) {
		this.max = Math.max(a, b);
	}

	public Function(double a, double b, double c) {
		this.area = a * b * c;
	}

	public Function(String a, String b) {
		this.flag = a == b;
	}

	public int getMax() {
		return max;
	}

	public double getArea() {
		return area;
	}

	public boolean isFlag() {
		return flag;
	}
	
	
}
