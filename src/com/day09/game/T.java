package com.day09.game;

public class T extends Shap {
	public T() {
	}

	public T(int x, int y) {
		cell[0] = new Cell(x, y);
		cell[1] = new Cell(x, y + 1);
		cell[2] = new Cell(x, y + 2);
		cell[3] = new Cell(x + 1, y + 1);
	}

}
