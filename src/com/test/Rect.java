package com.test;

public class Rect {
    protected double width;
    protected double height;

    public Rect() {
        this.width = 10;
        this.height = 10;
    }

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return (this.width + this.height) * 2;
    }
}
