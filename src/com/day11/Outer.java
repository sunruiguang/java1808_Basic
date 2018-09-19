package com.day11;

public class Outer {
	int a;
	private int b;
	
	inter i;
	
	public Outer(){
		i = new inter();
	}
	
	public Outer(int a){
		this.a = a;
	}
	
	public void outerMethod(){
		System.out.println("外部类的方法");
	}
	
	public inter creatInter(){
		return new inter();
	}
	
	class inter{
		int c;
		public inter(){
			
		}
		
		public inter(int c){
			this.c = c;
		}
		
		public void interMethod(){
			System.out.println("外部类的方法");
			System.out.println(this.c);
			System.out.println(Outer.this.a);
			System.out.println(Outer.this.b);
			Outer.this.outerMethod();
		}
	}
}
