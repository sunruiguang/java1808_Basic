package com.day13;

public class Demo {
	public static void main(String[] args) {
		String str = "�Ϻ�����ˮ���Ժ���";
		System.out.println(is(str));
//		System.out.println(new StringBuffer(str).reverse().toString().equals(str));
	}
	
	private static boolean is(String str){
		for(int i =0 ;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
		}
		return true;
	}
}
