package com.day09.game;

public class I extends Shap {
	public I() {

	}

	public I(int x, int y) {
		cell[0] = new Cell(x, y);
		cell[1] = new Cell(x + 1, y);
		cell[2] = new Cell(x + 2, y);
		cell[3] = new Cell(x + 3, y);
	}
}
