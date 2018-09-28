package com.day18;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo02RandomAccessFile {

    @Test
    public void method() {
        try {
            RandomAccessFile src = new RandomAccessFile("22.txt", "r");
            RandomAccessFile dest = new RandomAccessFile("dest.txt", "rw");
            long start = System.currentTimeMillis();
            int index = -1;
            while((index = src.read())!= -1){
                dest.write(index);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            src.close();
            dest.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
