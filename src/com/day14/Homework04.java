package com.day14;

public class Homework04 {
	public static void main(String[] args) {
		String str = "name=zs age=18 className=2011011051";
		String[] strArr = str.split(" ?[a-zA-Z]+=");
		for (String s : strArr) {
			System.out.println(s);
		}
	}
}

class Teacher {
	private String name;
	private int age;

	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [age=" + age + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (obj instanceof Teacher) {
			Teacher teacher = (Teacher) obj;
			return this.name.equals(teacher.name) && this.age == teacher.age;
		}
		return true;
	}

}