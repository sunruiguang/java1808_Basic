package com.day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("zs", 12, 123));
        list.add(new Student("ls", 23, 1233));
        list.add(new Student("ww", 4, 12334));
        list.add(new Student("zp", 88, 12331));
        list.add(new Student("sun", 66, 1223));
        list.add(new Student("song", 66, 2123));
        Collections.sort(list);

        for (Student student : list
        ) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.equals(o.name)) {
            if (this.age == o.age) {
                return this.id - o.id;
            }
            return this.age - o.age;
        }
        return this.name.compareTo(o.name);
    }
}
