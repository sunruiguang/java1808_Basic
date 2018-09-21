package com.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<10;i++){
			list.add(i);
		}
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()){
			Object obj = iterator.next();
			if(obj instanceof Integer){
				if(obj.equals(2)){
					iterator.remove();
				}
			}
		}
		System.out.println(list);
		
	}
}
