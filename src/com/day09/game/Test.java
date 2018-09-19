package com.day09.game;

public class Test {
	public static void main(String[] args) {
		Shap shap = new T(0, 0);
		printShap(shap);
		System.out.println("+++++++++++++++++++++++++++");
		shap.down(3);
		printShap(shap);
	}

	private static void printShap(Shap shap) {
		int k = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (k < 4 && shap.cell[k].x == i && shap.cell[k].y == j) {
					System.out.print("* ");
					k++;
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}
