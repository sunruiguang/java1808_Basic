package com.day20;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class homework01 {
    Map<Character, Integer> map = new HashMap<>();

    @Test
    public void method() {
        try {
            FileInputStream fis =  new FileInputStream("1.txt");
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String str = null;
            while ((str = br.readLine()) != null) {
                check(str);
            }
            print();
            br.close();
            isr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void check(String str) {
        for (int i = 0; i < str.length(); i++) {
            Integer num = map.get(str.charAt(i));
            if (num == null) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), num + 1);
            }
        }
    }

    public void print() {
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        try {
            FileOutputStream fos = new FileOutputStream("num.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
            PrintWriter pw = new PrintWriter(osw, true);
            for (Map.Entry<Character, Integer> entry : set) {
                pw.println(entry);
            }
            pw.close();
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
