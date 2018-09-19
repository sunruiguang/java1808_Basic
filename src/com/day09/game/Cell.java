package com.day09.game;

public class Cell {
	int x;
	int y;

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void down(int num) {
		x += num;
	}

	public void down() {
		x++;
	}

	public void left() {
		y--;
	}

	public void left(int num) {
		y -= num;
	}

	public void right() {
		y++;
	}

	public void right(int num) {
		y += num;
	}
}
