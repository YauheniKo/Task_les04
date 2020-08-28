package by.htp.les03.main;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {

		int[][] mas = massiveCreat(10, 20);
		printMas(mas);
		numberOfLines(mas, 5, 3);

	}

	public static int[][] massiveCreat(int lenI, int lenJ) {
		int[][] mas = new int[lenI][lenJ];
		Random ran = new Random();
		for (int i = 0; i < lenI; i++) {
			for (int j = 0; j < lenJ; j++) {
				mas[i][j] = ran.nextInt(15);

			}
		}
		return mas;

	}

	public static void printMas(int mas[][]) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");

			}
			System.out.println("");

		}
	}

	public static void numberOfLines(int mas[][], int value, int coincidence) {
		int numStr = 0;
		String s = "";
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == value) {
					numStr++;
				}

			}

			if (numStr >= coincidence) {
				s = s + i + "- строка содержит " + numStr + " числа(чисел) " + value + "\n";
				numStr = 0;
			}
		}
		if (s.length() == 0) {
			System.out.println("Строки массива, содержащие цифру " + 5 + " более трех, отсутствуют");
		} else
			System.out.println(s);

	}

}
