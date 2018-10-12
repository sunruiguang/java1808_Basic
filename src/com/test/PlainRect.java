package com.test;

public class PlainRect extends Rect {
    private double startX;
    private double startY;

    public PlainRect() {
        this.startX = 0;
        this.startY = 0;
    }

    public PlainRect(double width, double height, double startX, double startY) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }

    public boolean isInside(double x, double y) {
        return x >= startX && x <= startX + width && y >= startY && y <= startY + height;
    }

    public static void main(String[] args) {
        PlainRect plainRect = new PlainRect(20, 10, 10, 10);
        System.out.println(plainRect.area());
        System.out.println(plainRect.perimeter());
        if(plainRect.isInside(25.5,13)){
            System.out.println("在矩形内");
        }else{
            System.out.println("不在矩形内");
        }
    }

}
