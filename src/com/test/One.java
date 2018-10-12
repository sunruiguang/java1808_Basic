package com.test;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        char c = (char) (Math.random() * 26 + 65);
        char d = (char) (Math.random() * 26 + 97);
        StringBuffer sb = new StringBuffer();
        int[] arr = new int[4];
        while (sb.length() < 4) {
            int f = (int) (Math.random() * 4);
            if (arr[f] == 0) {
                switch (f) {
                    case 0:
                        sb.append(a);
                        break;
                    case 1:
                        sb.append(b);
                        break;
                    case 2:
                        sb.append(c);
                        break;
                    case 3:
                        sb.append(d);
                        break;
                    default:
                        break;
                }
            }
            arr[f] = 1;
        }
        System.out.println(sb.toString());
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.toUpperCase().equals(sb.toString().toUpperCase())){
            System.out.println("正确");
        }else{
            System.out.println("错误");
        }
        if(str.toLowerCase().equals(sb.toString().toLowerCase())){
            System.out.println("正确");
        }else{
            System.out.println("错误");
        }
        if(str.equalsIgnoreCase(sb.toString())){
            System.out.println("正确");
        }else{
            System.out.println("错误");
        }
    }
}
