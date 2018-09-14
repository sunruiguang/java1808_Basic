package com.day09.game;

public class Cell {
	int x;
	int y;

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void down(int num) {
		y += 3;
	}

	public void down() {
		y++;
	}

	public void left() {
		x--;
	}

	public void right() {
		x++;
	}
}
