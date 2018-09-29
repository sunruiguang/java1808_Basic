package com.day20;

import org.junit.Test;

import java.io.*;

public class Demo01WR {
    @Test
    public void method(){
        try {
            OutputStream os = new FileOutputStream("1.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
            osw.write("你好");
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method1(){
        try {
            InputStream is = new FileInputStream("1.txt");
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            int index = -1;
            while((index = isr.read())!=-1){
                System.out.println(index);
            }
            isr.close();;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method2(){
        try {
            FileInputStream fis = new FileInputStream("ddd.txt");
            InputStreamReader isr = new InputStreamReader(fis,"utf-8");
            FileOutputStream fos = new FileOutputStream("dest.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
            int index = -1;
            while((index = isr.read())!=-1){
                osw.write(index);
            }
            isr.close();
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
