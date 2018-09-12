package com.day07.game;

public class Draw {
	Cell[] cell = new Cell[4];

	public void tdown() {
		for (int i = 0; i < cell.length; i++) {
			cell[i].down();
		}
	}
	
	public void tdown(int num) {
		for (int i = 0; i < cell.length; i++) {
			cell[i].down(num);
		}
	}
}
