package com.day09.game;

public class Shap {
	Cell[] cell;

	public Shap() {
		cell = new Cell[4];
	}

	public void down() {
		for (Cell cell : this.cell) {
			cell.down();
		}
	}
	
	public void down(int num){
		for(Cell cell:this.cell){
			cell.down(num);
		}
	}
	
	public void left() {
		for (Cell cell : this.cell) {
			cell.down();
		}
	}
	
	public void left(int num){
		for(Cell cell:this.cell){
			cell.down(num);
		}
	}
	
	public void right() {
		for (Cell cell : this.cell) {
			cell.down();
		}
	}
	
	public void right(int num){
		for(Cell cell:this.cell){
			cell.down(num);
		}
	}
}
