package com.day09.game;

public class S extends Shap {
	public S() {

	}

	public S(int x, int y) {
		cell[0] = new Cell(x, y);
		cell[1] = new Cell(x, y + 1);
		cell[2] = new Cell(x + 1, y);
		cell[3] = new Cell(x + 1, y + 1);
	}
}
