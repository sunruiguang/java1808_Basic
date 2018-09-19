package com.day11;

public class TestOuter {
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o.i);
		
		o.creatInter().c = 20;
		o.creatInter().interMethod();
		
		Outer.inter b = new Outer().new inter();
		b.c = 12;
	}
}
