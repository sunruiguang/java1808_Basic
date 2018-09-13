package com.day08;

public class Penda {
	String name;
	int age;
	String address;
	int number;

	public Penda() {
		super();
	}

	public Penda(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Penda(String name, int age, String address, int number) {
		this(name, age);
		this.address = address;
		this.number = number;
	}

	public void play() {
		System.out.println("ÍæË£");
	}

	public void yell() {
		System.out.println("ßãßã");
	}

	public void actingCute() {
		System.out.println("ÂôÃÈ");
	}

	@Override
	public String toString() {
		return "Penda [address=" + address + ", age=" + age + ", name=" + name
				+ ", number=" + number + "]";
	}

}
