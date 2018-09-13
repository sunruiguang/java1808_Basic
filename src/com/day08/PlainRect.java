package com.day08;

public class PlainRect extends Rect {
	int startX;
	int startY;

	public PlainRect(int startX, int startY, int width, int height) {
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
	}

	public PlainRect() {
		super();
	}

	public boolean isInside(double x, double y) {
		if (x >= startX && x <= (startX + width) && y < startY
				&& y >= (startY - height))
			return true;
		return false;
	}
}
