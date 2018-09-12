package com.day07.game;

/**
 * 主类：协调各个类，产生一定逻辑，处理数据（各个类）
 * 
 * @author Administrator
 * 
 */
public class Main {
	public static void main(String[] args) {
		Draw draw = new Draw();
		tDraw(draw, 's');
		print(draw);
		System.out.println("-------------------------------");
		draw.tdown(3);
		print(draw);

	}

	private static void tDraw(Draw draw, char ch) {

		for (int i = 0; i < draw.cell.length; i++) {
			Cell c = new Cell();
			switch (ch) {
			case 't':
				if (i != 3) {
					c.x = i + 1;
					c.y = 1;
				} else {
					c.x = 2;
					c.y = 2;
				}
				break;
			case 'l':
				if (i != 3) {
					c.x = 1;
					c.y = i + 1;
				} else {
					c.x = 2;
					c.y = 3;
				}
				break;
			case 'r':
				c.x = i + 1;
				c.y = 1;
				break;
			case 's':
				if (i < 2) {
					c.x = i + 1;
					c.y = 1;
				} else if (i == 2) {
					c.x = 3 - i;
					c.y = 2;
				} else {
					c.x = 5-i;
					c.y = 2;
				}
				break;
			default:
				break;
			}
			draw.cell[i] = c;
		}
	}

	private static void print(Draw draw) {
		for (int i = 1, count = 0; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (count < draw.cell.length && draw.cell[count].x == j
						&& draw.cell[count].y == i) {
					System.out.print("口  ");
					count++;
				} else {
					System.out.print("- ");
				}

			}
			System.out.println();
		}
	}
}
