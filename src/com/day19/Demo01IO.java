package com.day19;

import org.junit.Test;

import java.io.*;

public class Demo01IO {
    @Test
    public void method() {
        try {
            OutputStream outputStream = new FileOutputStream("22.txt");
            outputStream.write(20);
            outputStream.write(30);
            outputStream.write("中国人".getBytes("gbk"));
            outputStream.close();
            InputStream inputStream = new FileInputStream("22.txt");
            byte[] buf = new byte[30];
            int n = inputStream.read(buf);
            String s = new String(buf, "gbk");
            System.out.println(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method2() {
        try {
            InputStream inputStream = new FileInputStream("22.txt");
            OutputStream outputStream = new FileOutputStream("1.txt", true);
            byte[] buf = new byte[1024];
            int index = -1;
            while ((index = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, index);
            }
            outputStream.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
