package com.day02;

import java.util.ArrayList;
import java.util.List;

public class Homework12 {
	public static void main(String[] args) {
		List<ShoppingMall> shoppingMallList = new ArrayList<ShoppingMall>();
		shoppingMallList.add(new ShoppingMall("MacBookAir", 13.3, 6988.88,
				"i5������4GB�ڴ�128��̬Ӳ��", 5));
		shoppingMallList.add(new ShoppingMall("ThinkpadT450", 14.0, 5999.99,
				"i5������4GB�ڴ�500GӲ��", 10));
		shoppingMallList.add(new ShoppingMall("ASUS-FL5800", 15.6, 4999.88,
				"i7������4GB�ڴ�500GӲ��", 18));
		System.out.println("------------------------------��Ʒ����嵥-------------------------------");
		System.out.println("Ʒ���ͺ�\t\t" + "�ߴ�\t" + "�۸�\t" + "\t����\t\t\t" + "���");
		int stockCount = 0;
		double allMoney = 0;
		for (ShoppingMall item : shoppingMallList) {
			stockCount += item.getStock();
			allMoney += item.getPrice();
			System.out.println(item.getType() + "\t" + item.getSize() + "\t"
					+ item.getPrice() + "\t\t" + item.getExplain() + "\t"
					+ item.getStock());
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("�ܿ������" + stockCount);
		System.out.println("�����Ʒ�ܽ�" + allMoney);
	}
}

class ShoppingMall {
	private String type;
	private double size;
	private double price;
	private String explain;
	private int stock;

	public ShoppingMall(String type, double size, double price, String explain,
			int stock) {
		super();
		this.type = type;
		this.size = size;
		this.price = price;
		this.explain = explain;
		this.stock = stock;
	}

	public String getType() {
		return type;
	}

	public double getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}

	public String getExplain() {
		return explain;
	}

	public int getStock() {
		return stock;
	}

	@Override
	public String toString() {
		return "ShoppingMall [explain=" + explain + ", price=" + price
				+ ", size=" + size + ", stock=" + stock + ", type=" + type
				+ "]";
	}

}
