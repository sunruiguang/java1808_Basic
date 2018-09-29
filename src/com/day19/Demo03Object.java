package com.day19;

import org.junit.Test;

import java.io.*;

public class Demo03Object {
    @Test
    public void method(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("stu.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Student student = new Student("zs", 20);

            objectOutputStream.writeObject(student);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method2(){
        try {
            FileInputStream fileInputStream = new FileInputStream("stu.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            if(object instanceof Student){
                Student student = (Student) object;
                System.out.println(student.getName());
                System.out.println(student.getAge());
            }
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Student implements Serializable {

    private String name;
    private transient int age;
    private char sex;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}