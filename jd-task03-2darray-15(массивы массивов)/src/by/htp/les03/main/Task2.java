package by.htp.les03.main;

import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		int[][] mas = new int[5][4];
		Random ran = new Random();

		int k = 1;
		int p = 2;
		if (k < mas.length & p < mas[k].length) {

			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = ran.nextInt(10);
				}
			}
			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.print(mas[i][j] + " ");
				}
				System.out.println("");
			}

			System.out.println("Выводим к-ю строку");
			for (int j = 0; j < mas[k].length; j++) {
				System.out.print(mas[k][j] + " ");
			}
			System.out.println("");
			System.out.println("Выводим р-й столбец");

			for (int i = 0; i < mas.length; i++) {
				System.out.println(mas[i][p] + " ");
			}
		}

	}
}
