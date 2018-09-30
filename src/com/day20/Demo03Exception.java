package com.day20;

import org.junit.Test;

public class Demo03Exception {
    @Test
    public void method() {
        Student s = new Student();
        s.setAge(90);
        System.out.println(s.getAge());
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) throw new RuntimeException("not is person");
        this.age = age;
    }
}