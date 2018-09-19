package com.day09.game;

public class Z extends Shap {
	public Z() {

	}

	public Z(int x, int y) {
		cell[0] = new Cell(x, y);
		cell[1] = new Cell(x, y + 1);
		cell[2] = new Cell(x + 1, y + 1);
		cell[3] = new Cell(x + 1, y + 2);
	}
}
