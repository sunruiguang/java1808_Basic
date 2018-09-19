package com.day09.game;

public class L extends Shap {
	public L() {
	}

	public L(int x, int y) {
		cell[0] = new Cell(x, y);
		cell[1] = new Cell(x + 1, y);
		cell[2] = new Cell(x + 2, y);
		cell[3] = new Cell(x + 2, y + 1);
	}
}
