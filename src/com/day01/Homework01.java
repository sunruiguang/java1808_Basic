package com.day01;

public class Homework01 {
	public static void main(String[] args) {
		byte by = Byte.MAX_VALUE;
		byte by1 = Byte.MIN_VALUE;
		
		System.out.println(by);
		System.out.println(by1);
		System.out.println(by+Math.abs(by1));
		
		short sh = Short.MAX_VALUE;
		short sh1 = Short.MIN_VALUE;
		
		System.out.println(sh);
		System.out.println(sh1);
		System.out.println(sh+Math.abs(sh1));
		int in = Integer.MAX_VALUE;
		int in1 = Integer.MIN_VALUE;
		
		System.out.println(in);
		System.out.println(in1);
		System.out.println((long)in+(long)Math.abs(in1));
		long lo = Long.MAX_VALUE;
		long lo1 = Long.MIN_VALUE;
		
		System.out.println(lo);
		System.out.println(lo1);
		System.out.println(lo+Math.abs(lo1));
		float fl = Float.MAX_VALUE;
		float fl1 = Float.MIN_NORMAL;
		
		System.out.println(fl);
		System.out.println(fl1);
		System.out.println(fl+Math.abs(fl1));
		double db = Double.MAX_VALUE;
		double db1 = Double.MIN_NORMAL;
		
		System.out.println(db);
		System.out.println(db1);
		System.out.println(db+Math.abs(db1));
		
		char ch = Character.MAX_VALUE;
		char ch1 = Character.MIN_VALUE;
		
		System.out.println(ch);
		System.out.println(ch1);
	}
}
