package com.day18;


import org.junit.Test;

import java.io.*;

public class Demo01RandomAccessFile {

    @Test
    public void method1() {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("11.txt", "rw");
            randomAccessFile.write(10);
            randomAccessFile.write(11);
            randomAccessFile.write(255);
            randomAccessFile.write(256);
            randomAccessFile.write(257);
            randomAccessFile.write(-1);
            randomAccessFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method2() {
        try {
            FileInputStream fileInputStream = new FileInputStream("22.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            FileOutputStream fileOutputStream = new FileOutputStream("ddd.txt", true);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            int d = -1;
            while((d = bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(d);
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
