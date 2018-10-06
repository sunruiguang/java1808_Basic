package com.test;

import java.util.HashSet;
import java.util.Set;

public class Test01 {
    public static void main(String args[]) {
        Set<String> set = new HashSet<>();
        set.add("zs");
        set.add("ls");
        set.add("sun");
        System.out.println("hello");
        for (String i : set) {
            System.out.println(i);
        }
    }
}
