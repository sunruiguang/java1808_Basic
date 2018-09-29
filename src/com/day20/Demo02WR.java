package com.day20;

import org.junit.Test;

import java.io.*;

public class Demo02WR {
    @Test
    public void method(){
        try {
            PrintWriter pw = new PrintWriter("1.txt");
            pw.print("你好");
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method2(){
        try {
            FileInputStream fis = new FileInputStream("ddd.txt");
            InputStreamReader osr = new InputStreamReader(fis,"UTF-8");
            BufferedReader br = new BufferedReader(osr);
            String str = null;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
            osr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
