package com.day08;

public class WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;

	public WuMingFen() {
		super();
	}

	public WuMingFen(String theMa, int quantity) {
		this.theMa = theMa;
		this.quantity = quantity;
	}

	public WuMingFen(String theMa, int quantity, boolean likeSoup) {
		this(theMa, quantity);
		this.likeSoup = likeSoup;
	}

	public String getTheMa() {
		return theMa;
	}

	public void setTheMa(String theMa) {
		this.theMa = theMa;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isLikeSoup() {
		return likeSoup;
	}

	public void setLikeSoup(boolean likeSoup) {
		this.likeSoup = likeSoup;
	}
	
	
}
