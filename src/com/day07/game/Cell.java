package com.day07.game;

/**
 * ������ ���ԣ�x��y �������½������ƣ�����
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
