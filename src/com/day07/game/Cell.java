package com.day07.game;

/**
 * 方块类 属性：x，y 方法：下降，左移，右移
 * 
 * @author Administrator
 * 
 */
public class Cell {
	int x;
	int y;

	public void down(int num) {
		y+=3;
	}
	
	public void down() {
		y++;
	}
	
	public void left(){
		x--;
	}
	
	public void right(){
		x++;
	}
}
