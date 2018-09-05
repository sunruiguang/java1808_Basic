package com.day02;

import java.util.ArrayList;
import java.util.List;

public class Homework12 {
	public static void main(String[] args) {
		List<ShoppingMall> shoppingMallList = new ArrayList<ShoppingMall>();
		shoppingMallList.add(new ShoppingMall("MacBookAir", 13.3, 6988.88,
				"i5处理器4GB内存128固态硬盘", 5));
		shoppingMallList.add(new ShoppingMall("ThinkpadT450", 14.0, 5999.99,
				"i5处理器4GB内存500G硬盘", 10));
		shoppingMallList.add(new ShoppingMall("ASUS-FL5800", 15.6, 4999.88,
				"i7处理器4GB内存500G硬盘", 18));
		System.out.println("------------------------------商品库存清单-------------------------------");
		System.out.println("品牌型号\t\t" + "尺寸\t" + "价格\t" + "\t配置\t\t\t" + "库存");
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
		System.out.println("总库存数：" + stockCount);
		System.out.println("库存商品总金额：" + allMoney);
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
