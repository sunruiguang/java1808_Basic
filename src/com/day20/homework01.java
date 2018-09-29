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
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("1.txt");
            InputStreamReader osr = new InputStreamReader(fis, "utf-8");
            BufferedReader br = new BufferedReader(osr);
            String str = null;
            while ((str = br.readLine()) != null) {
                check(str);
            }
            print();
            br.close();
            osr.close();
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
        for (Map.Entry<Character, Integer> entry : set) {
            System.out.println(entry);
        }
    }
}
